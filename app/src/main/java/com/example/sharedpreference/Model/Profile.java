package com.example.sharedpreference.Model;

public class Profile {
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
