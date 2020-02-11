package com.example.sharedpreference.Model;

import java.io.Serializable;

public class Profile implements Serializable {
    private int age;
    private String name;

    public Profile(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
