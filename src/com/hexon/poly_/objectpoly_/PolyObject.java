package com.hexon.poly_.objectpoly_;

public class PolyObject {
    public static void main(String[] args) {

        // 对象多态的特点

        // animal的编译类型为： Animal； 运行类型为: Dog;
        Animal animal = new Dog();
        // 因为运行时，animal的运行类型为Dog，所以，执行的cry是Dog的；
        animal.cry();

        // 将animal重新指向到Cat类型，执行到改行时，animal的运行类型为Cat
        animal = new Cat();
        // 执行Cat的cry方法
        animal.cry();


    }
}
