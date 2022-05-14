package stream_api.task_1;

import stream_api.models.Fruit;
import stream_api.models.FruitFilter;

import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        FruitFilter filter = new FruitFilter();
       filter.getAllFruits().filter(fruit -> fruit.getFresh()).forEach(System.out::println);
    }
}
