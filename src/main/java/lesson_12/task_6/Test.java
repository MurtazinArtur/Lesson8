package lesson_12.task_6;

import lesson_12.task_1.Cat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Андрей", 9);
        Cat cat2 = new Cat("Олег", 5);
        Cat cat3 = new Cat("Андрей", 4);
        Cat cat4 = new Cat("Игорь", 6);
        Cat cat5 = new Cat("Андрей", 7);
        List<Cat> list = new ArrayList<>(){{
            add(cat1);
            add(cat2);
            add(cat3);
            add(cat4);
            add(cat5);
        }};

        System.out.println("-------до сортировки--------");
        for (Cat u : list) {
            System.out.println(u);
        }
        System.out.println("-------после сортировки-----");
        Collections.sort(list);
        for (Cat u : list) {
            System.out.println(u);
        }
    }
}
