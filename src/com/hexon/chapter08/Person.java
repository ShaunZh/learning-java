package com.hexon.chapter08;

public class Person {
    private int age;
    private String name;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    String say() {
        return "我是: " + this.name + "，今年: " + this.age + "岁; ";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
