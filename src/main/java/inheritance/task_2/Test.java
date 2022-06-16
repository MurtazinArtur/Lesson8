package inheritance.task_2;

public class Test extends Point{
    static double x = 4.7;

    public static void main(String[] args) {
        new Test().printX();
    }

    private void printX() {
        System.out.println(x);
        System.out.println(Point.x);
    }

}
