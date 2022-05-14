package stream_api.models;

public abstract class Fruit {
    Boolean fresh;
    String toDo;

    public Boolean getFresh() {
        return fresh;
    }

    public void setFresh(Boolean fresh) {
        this.fresh = fresh;
    }

    public String getToDo() {
        return toDo;
    }

    public void setToDo(String toDo) {
        this.toDo = toDo;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "fresh=" + fresh +
                ", toDo='" + toDo + '\'' +
                '}';
    }
}
