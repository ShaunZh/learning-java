package com.hexon.poly_.detail_;

public class PolyDetail {
    public static void main(String[] args) {
        // 此处就是想上转型，animal的编译类型是Animal，运行类型是Cat，animal对象向上转型到Cat的父类Animal
        Animal animal = new Cat("小花");

        // animal只能调用Animal的方法
        animal.eat();
        animal.sleep();
        animal.show();
        animal.run();

        // 虽然animal的运行类型是Cat，但是其不能直接调用Cat中的方法catchMouse；
        // animal.catchMouse();
    }
}
