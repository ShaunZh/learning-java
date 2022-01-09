package com.hexon.poly_;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 随着要feed的动物及食物的增加，feed类会变得非常庞大且啰嗦
    // update: 使用多态机制来解决主人喂食问题，Animal是动物类的父类，以及Food是食物的父类，它们都可以接收各自的子类，并调用其中方法
    public void feed(Animal animal, Food food) {
        System.out.println("主人" + this.name + "给" + animal.getName() + "喂养" + food.getName());
    }
//    public void feed(Cat cat, Fish fish) {
//        System.out.println("主人" + this.name + "给小猫" + fish.getName() + "喂养" + fish.getName());
//    }
}
