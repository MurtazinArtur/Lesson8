package stream_api.models;

public class Apple extends Fruit{
    public void eatApple(){
        System.out.println("Ем яблоко");
    }

     public void makeJam(){
        System.out.println("закатываю яблоки в банку");
    }

    @Override
    public String toString() {
        return "Apple{" +
                "fresh=" + fresh +
                ", toDo='" + toDo + '\'' +
                '}';
    }
}
