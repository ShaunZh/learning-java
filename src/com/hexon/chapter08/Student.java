package com.hexon.chapter08;

import java.util.Random;

public class Student extends Person {
    private int id;
    private int score;

    int creatId() {
        Random random = new Random();
        return random.nextInt(100000);
    }

    Student(String name, int age, int score) {
        super(name, age);
        this.id = creatId();
        this.score = score;
    }

    String say() {
        String info = super.say();
        return info + "我的分数是: " + this.score + "; 我的id是: " + this.id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
