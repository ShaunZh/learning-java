package com.hexon.poly_;

public class poly01 {
    public static void main(String[] args) {
        Master tom = new Master("汤姆");

        Dog dog = new Dog("大黄");
        Bone bone = new Bone("肋骨");

        Cat cat = new Cat("小花猫");
        Fish fish = new Fish("鲫鱼");

        Pig pig = new Pig("小红");
        Rice rice= new Rice("黑米");


        tom.feed(dog, bone);
        tom.feed(cat, fish);
        tom.feed(pig, rice);
    }
}
