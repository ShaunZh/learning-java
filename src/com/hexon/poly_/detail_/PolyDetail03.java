package com.hexon.poly_.detail_;

public class PolyDetail03 {
    public static void main(String[] args) {
        AA aa = new BB();

        // instanceof判断的是运行类型，也就是判断aa的运行类型是否为AA的子类型或类型
        System.out.println(aa instanceof AA);
        System.out.println(aa instanceof Object);
    }
}

class AA {

}

class BB extends AA{

}
