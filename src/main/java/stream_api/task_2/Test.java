package stream_api.task_2;

import stream_api.models.FruitFilter;

public class Test {
    public static void main(String[] args) {
        FruitFilter filter = new FruitFilter();
        filter.getAllFruits().filter(fruit -> !(fruit.getFresh())).forEach(fruit ->{
            fruit.setToDo("Выкинуть в мусорку");
            System.out.println(fruit);
        });
    }
}
