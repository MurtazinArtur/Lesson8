package lesson_12.task_3;

import lesson_12.task_1.Cat;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<Cat> catSet = new HashSet<>();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        catSet.add(cat1);
        catSet.add(cat2);

        catSet.stream().forEach(System.out::println);
    }
}
