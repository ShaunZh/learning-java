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
        // 向下转型(强制转型)：将animal向下转型为Cat类型，
        // 注意：animal必须是指向Cat的对象，也就是说进行向下转型时，被转对象必须是指向目标对象的，才可向下转型，否则会出错
        Cat cat = (Cat) animal;
        cat.catchMouse();
    }
}
