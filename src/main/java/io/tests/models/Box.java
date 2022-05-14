package io.tests.models;

import java.io.Serializable;
import java.util.List;

public class Box implements Serializable {
    private static final long serialVersionUID = 18;

    List<Fruit> fruits;
    String owner;

    public List<Fruit> getFruits() {
        return fruits;
    }

    public void setFruits(List<Fruit> fruits) {
        this.fruits = fruits;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruits=" + fruits +
                ", owner='" + owner + '\'' +
                '}';
    }
}
