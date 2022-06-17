package collections.task_4;

import collections.task_1.Cat;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Map<Owner, Cat> catMap = new HashMap<>();
        Owner owner = new Owner();
        owner.setAge(22);
        owner.setName("Alex");
        Cat cat = new Cat();
        cat.setName("Жужа");
        catMap.put(owner, cat);
        catMap.forEach((owner1, cat1) -> System.out.println(owner1.toString() + " " + cat1.toString()));
    }
}
