package stream_api.task_3;

import stream_api.models.FruitFilter;
import stream_api.models.Orange;

public class Test {
    public static void main(String[] args) {
        FruitFilter filter = new FruitFilter();
        filter.getAllFruits().filter(fruit -> fruit.getFresh() && fruit instanceof Orange).forEach(fruit ->{
            ((Orange) fruit).eatOrange();
            System.out.println(fruit);
        });
    }
}
