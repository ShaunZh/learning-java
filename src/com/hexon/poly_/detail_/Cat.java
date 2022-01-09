package com.hexon.poly_.detail_;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void catchMouse() {
        System.out.println(this.getName() + "抓老鼠");
    }
}
