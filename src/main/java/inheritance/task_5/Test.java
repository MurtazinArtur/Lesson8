package inheritance.task_5;

public class Test {
    static void mountain() {
        System.out.println("Как дела?");
    }
    static Test favorite(){
        System.out.print("Привет! ");
        return null;
    }
    public static void main(String[] args) {
        favorite().mountain();
    }

}
