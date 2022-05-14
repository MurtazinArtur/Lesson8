package io.tests.task_6.models;

import java.util.List;

public class City {
    String squadName;
    String homeTown;
    Integer formed;
    String secretBase;
    Boolean active;
    List<Member> members;

    @Override
    public String toString() {
        return "City{" +
                "squadName='" + squadName + '\'' +
                ", homeTown='" + homeTown + '\'' +
                ", formed=" + formed +
                ", secretBase='" + secretBase + '\'' +
                ", active=" + active +
                ", members=" + members +
                '}';
    }
}
