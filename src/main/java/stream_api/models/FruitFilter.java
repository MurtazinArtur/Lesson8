package stream_api.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FruitFilter {
    public Stream<Fruit> getAllFruits() {
        Apple apple1 = new Apple();
        apple1.setFresh(true);
        Apple apple2 = new Apple();
        apple2.setFresh(true);
        Apple apple3 = new Apple();
        apple3.setFresh(true);
        Apple apple4 = new Apple();
        apple4.setFresh(false);
        Apple apple5 = new Apple();
        apple5.setFresh(false);
        Orange orange1 = new Orange();
        orange1.setFresh(true);
        Orange orange2 = new Orange();
        orange2.setFresh(true);
        Orange orange3 = new Orange();
        orange3.setFresh(false);
        Orange orange4 = new Orange();
        orange4.setFresh(false);
        Orange orange5 = new Orange();
        orange5.setFresh(false);
        List<Fruit> fruits = new ArrayList<>() {{
            add(apple1);
            add(apple2);
            add(apple3);
            add(apple4);
            add(apple5);
            add(orange1);
            add(orange2);
            add(orange3);
            add(orange4);
            add(orange5);
        }};
        return fruits.stream();
    }
}
