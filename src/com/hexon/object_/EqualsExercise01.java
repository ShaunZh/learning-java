package com.hexon.object_;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person p1 =  new Person("hexon", 18);
        Person p2 =  new Person("hexon", 18);
        System.out.println(p1.equals(p2));
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 重写equals
    public boolean equals(Person obj) {
        if (!this.name.equals(obj.name)) {
            return false;
        }
        if (this.age != obj.age) {
            return false;
        }
        return true;
    }
}