package inheritance.task_6;

public class Test extends T1{
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(T2.print());
        System.out.println(T1.print());
    }

    static String print() {
        return "Test";
    }
}

class T1 extends T2 {
    static String print() {
        return "T1";
    }
}

class T2 {
    static String print() {
        return "T2";
    }

}
