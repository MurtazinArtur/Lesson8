package lesson_10_11.task_1;

import java.util.ArrayList;
import java.util.List;

public class PaintedPoint {
    interface A {}
    interface B extends A{}
    interface C extends B{}

    static class Aa implements A {}
    static class Bb implements B {}
    static class Cc implements C {}

    public static void main(String[] args) {
        Aa a = new Aa();
        Bb b = new Bb();
        Cc c = new Cc();

        List<A> cList = new ArrayList<>();
        cList.add(a);
        cList.add(b);
        cList.add(c);
    }
}