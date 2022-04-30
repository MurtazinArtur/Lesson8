package lesson_10_11.Task_6;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Arrays.stream(Season.values()).forEach(System.out::println);
    }

    enum Season {WINTER, SPRING, SUMMER, FALL}
}

