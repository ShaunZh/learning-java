// override
package com.hexon.chapter08;

public class ExerciseOverride {
    public static void main(String args[]) {
        Person hexon = new Person("Hexon", 18);
        Student wan = new Student("wan", 17, 100);
        System.out.println(hexon.say());
        System.out.println(wan.say());
    }
}
