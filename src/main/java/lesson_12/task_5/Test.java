package lesson_12.task_5;

import lesson_12.task_1.Cat;
import lesson_12.task_4.Owner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Owner, List<Cat>> catMap = new HashMap<>();
        Owner owner = new Owner();
        owner.setAge(22);
        owner.setName("Alex");
        Cat cat = new Cat();
        cat.setName("Жужа");
        Cat nextCat = new Cat();
        nextCat.setName("Вольдемар");
        List<Cat> cats = new ArrayList<>(){{
            add(cat);
            add(nextCat);
        }
        };
        catMap.put(owner, cats);
        catMap.forEach((owner1, catList) -> System.out.println(owner1.toString() + " " + catList.toString()));
    }
}
