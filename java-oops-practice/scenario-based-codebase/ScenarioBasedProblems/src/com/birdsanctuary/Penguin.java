package com.birdsanctuary;

public class Penguin extends Bird implements Swimmable {
    public Penguin(String name, String id) {
        super(name, "Penguin", id);
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming underwater...");
    }
}