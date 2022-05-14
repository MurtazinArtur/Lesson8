package io.tests.task_5;

import io.tests.models.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class AnotherOneFruitTests {
    public static void main(String[] args) {
        Box2 box = new Box2();
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
        Box2 deserializeBox = deserializeBox();
        System.out.println("Десереализованная коробка " + deserializeBox.toString());
    }

    private static void serializeBox(Box2 box){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("box.dat")))
        {
            oos.writeObject(box);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    private static Box2 deserializeBox(){
        Box2 resultBox = null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("box.dat")))
        {
            resultBox = (Box2) ois.readObject();
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return resultBox;
    }
}
