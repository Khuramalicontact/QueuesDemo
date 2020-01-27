package be.intecbrussel.persons;

import java.util.ArrayDeque;
import java.util.Deque;

public class Person {
    private Gender gender;
    private String name;


    public Person(Gender gender,String name) {
        this.gender = gender;
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "gender: " + gender +
                ", name: " + name + "";
    }
}

