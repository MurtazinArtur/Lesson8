package stream_api.task_5;

import stream_api.models.Apple;
import stream_api.models.Fruit;
import stream_api.models.FruitFilter;
import stream_api.models.Orange;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static io.tests.FileReadTest.readFileByLine;

public class Test {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
       readFileByLine("src/main/resources/fruits.txt").stream().forEach(fruit ->{
           if("яблоко".equals(fruit)){
               Apple apple = new Apple();
               apple.setFresh(true);
               fruits.add(apple);
           }else if("апельсин".equals(fruit)){
               Orange orange = new Orange();
               orange.setFresh(true);
               fruits.add(orange);
           }
       });
       fruits.forEach(System.out::println);
    }
}
