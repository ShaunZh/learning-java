package com.hexon.poly_.detail_;

public class PolyDetail02 {
    public static void main(String[] args) {
        // 属性没有重写之说！属性的值看编译类型，base的编译类型是Base，所以base.count 为20
        Base base = new Sub();
        System.out.println(base.count);
    }
}

class Base {
    int count = 20;
}

class  Sub extends Base {
    int count = 10;
}

