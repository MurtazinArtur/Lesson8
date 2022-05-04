package lesson_12.task_1;

import java.util.Comparator;

public class Cat extends Animal implements Comparable<Cat>, Comparator<Cat>{
    private String name;
    private Integer weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Cat(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    public Cat() {
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public int compareTo(Cat o) {
        int result = weight.compareTo(o.weight);
        if (result == 0){
           result = compare(this, o);
        }
        return result;
    }

    @Override
    public int compare(Cat o1, Cat o2) {
        String str1 = o1.getName();
        String str2 = o2.getName();
        return str1.compareTo(str2);
    }
}
