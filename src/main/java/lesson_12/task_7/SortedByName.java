package lesson_12.task_7;

import lesson_12.task_1.Cat;

import java.util.Comparator;

public class SortedByName implements  Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        String str1 = o1.getName();
        String str2 = o2.getName();
        return str1.compareTo(str2);
    }

}
