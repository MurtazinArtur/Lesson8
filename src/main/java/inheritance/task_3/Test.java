package inheritance.task_3;

import inheritance.task_3.Point;

public class Test extends Point {
    static double x = 4.7;

    public static void main(String[] args) {
        new Test().printX();
    }

    private void printX() {
        x = Point.x;
        System.out.println((int)x);
        System.out.println(Point.x);
    }

}
