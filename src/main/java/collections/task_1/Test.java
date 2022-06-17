package collections.task_1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

       animals.add(cat1);
       animals.add(cat2);
       animals.add(cat3);
       animals.add(cat4);
       animals.add(dog1);
       animals.add(dog2);
       animals.add(dog3);

       cats.add(cat1);
       cats.add(cat2);
       cats.add(cat3);
       cats.add(cat4);

       dogs.add(dog1);
       dogs.add(dog2);
       dogs.add(dog3);
    }
}
