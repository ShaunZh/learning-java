package com.hexon.poly_.detail_;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(this.name + "run;");
    }
    public void eat() {
        System.out.println(this.name + "eat;");
    }
    public void sleep() {
        System.out.println(this.name + "sleep;");
    }
    public void show() {
        System.out.println(this.name + "say hello;");
    }
}
