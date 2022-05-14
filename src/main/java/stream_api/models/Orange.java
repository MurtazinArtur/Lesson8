package stream_api.models;

public class Orange extends Fruit{
    public void eatOrange(){
        System.out.println("Ем апельсин");
    }

    @Override
    public String toString() {
        return "Orange{" +
                "fresh=" + fresh +
                ", toDo='" + toDo + '\'' +
                '}';
    }
}
