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
    public void feed(Dog dog, Bone bone) {
        System.out.println("主人" + this.name + "给小狗" + dog.getName() + "喂养" + bone.getName());
    }
    public void feed(Cat cat, Fish fish) {
        System.out.println("主人" + this.name + "给小猫" + fish.getName() + "喂养" + fish.getName());
    }
}
