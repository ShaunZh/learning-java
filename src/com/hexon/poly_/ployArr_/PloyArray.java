package com.hexon.poly_.ployArr_;

public class PloyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];

        persons[0] = new Person("Jack", 19);
        persons[1] = new Student("Student-Tom", 14, 100);
        persons[2] = new Student("Student-Bob", 14, 80);
        persons[3] = new Teacher("Teacher-Jim", 30, 39999);
        persons[4] = new Teacher("Teacher-Wan", 30, 20000);

        for (int i = 0 ; i < persons.length; i++) {
            System.out.println(persons[i].say());
            if (persons[i] instanceof Student) {
                Student student = (Student)persons[i];
                student.study();
            } else if (persons[i] instanceof Teacher) {
                Teacher teacher = (Teacher)persons[i];
                teacher.teach();
            } else if (persons[i] instanceof Person) {
                System.out.println("not");
            } else {
                System.out.println("类型有误");
            }
        }
    }
}
