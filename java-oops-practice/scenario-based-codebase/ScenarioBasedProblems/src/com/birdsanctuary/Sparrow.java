package com.birdsanctuary;

public class Sparrow extends Bird implements Flyable {
    public Sparrow(String name, String id) {
        super(name, "Sparrow", id);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying swiftly...");
    }
}