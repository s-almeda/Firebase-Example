package com.example.firebaseexample;

public class User {
    private String name;
    private String animal;

    public User(String name, String animal)
    {
        this.name = name;
        this.animal = animal;
    }

    public String getAnimal() {
        return animal;
    }

    public String getName() {
        return name;
    }
}
