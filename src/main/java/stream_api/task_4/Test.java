package stream_api.task_4;

import stream_api.models.Apple;
import stream_api.models.Fruit;
import stream_api.models.FruitFilter;

import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        FruitFilter filter = new FruitFilter();
        List<Fruit> appleList = filter.getAllFruits().filter(fruit -> fruit.getFresh() && fruit instanceof Apple).collect(Collectors.toList());
        appleList.forEach(apple -> {
            Apple apple1 = (Apple) apple;
            apple1.makeJam();
        });
    }
}
