package com.birdsanctuary;

@DeveloperInfo(developer = "EcoWing Team", version = "1.0")
public class Duck extends Bird implements Swimmable {
    public Duck(String name, String id) {
        super(name, "Duck", id);
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming gracefully...");
    }
}
