package io.tests.task_6.models;

import java.util.List;

public class Member {
    String name;
    Integer age;
    String secretIdentity;
    List<String> powers;

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", secretIdentity='" + secretIdentity + '\'' +
                ", powers=" + powers +
                '}';
    }
}
