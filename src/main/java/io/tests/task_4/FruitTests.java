package io.tests.task_4;

import io.tests.models.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FruitTests {
    public static void main(String[] args) {
        Box box = new Box();
        Apple apple = new Apple();
        Banana banana = new Banana();
        Orange orange = new Orange();
        List<Fruit> fruits = new ArrayList<>(){{
            add(apple);
            add(banana);
            add(orange);
        }};
        box.setFruits(fruits);
        box.setOwner("Вася");

        serializeBox(box);
        System.out.println(box);
        Box deserializeBox = deserializeBox();
        System.out.println("Десереализованная коробка " + deserializeBox.toString());
    }

    private static void serializeBox(Box box){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("box.dat")))
        {
            oos.writeObject(box);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    private static Box deserializeBox(){
        Box resultBox = null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("box.dat")))
        {
            resultBox = (Box) ois.readObject();
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return resultBox;
    }
}
