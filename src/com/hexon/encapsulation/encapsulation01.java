package com.hexon.encapsulation;

public class encapsulation01 {
    public static void main(String[] args) {
        Person hexon = new Person("hexon", 200000, 31);
        hexon.setSalary(400000);
        hexon.setAge(32);
        hexon.getInfo();
    }
}

class Person {
    public String name;
    private double salary;
    private int age;

    public Person(String name, double salary, int age) {
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 1 || name.length() > 6) {
            System.out.println("名字只能在1 ~ 6个字符长度");
            return;
        }
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1 || age > 120) {
            System.out.println("年龄只能在1  ~ 120之间");
        }
        this.age = age;
    }

    public void getInfo() {
        System.out.println(this.name + '\t' + this.age + "岁" + '\t' + "月薪 " + this.salary + "元");
    }
}
