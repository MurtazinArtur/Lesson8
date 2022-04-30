package lesson_10_11.Task_4;

class Super {
    static int taxi = 1729;
}
class Sub extends Super {
    static { System.out.print("Sub "); }
}
class Test {
    public static void main(String[] args) {
        Super sup = new Super();

        System.out.println(sup.taxi);
    }
}
