package inheritance.task_4;

public class Test extends Point {
    static double x = 4.7;

    public static void main(String[] args) {
        Test sample = new Test();
        sample.printBoth();
        System.out.println(x + " " + Point.x);
}

    private void printBoth() {
        System.out.println(x + " " + super.x);
    }
    }
