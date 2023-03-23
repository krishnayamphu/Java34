package oop;

public class Student {
    String name;
    int age;

    public static void main(String[] args) {
        Student s=new Student(); //object/instance
        s.name="Ramesh";
        s.age=20;
        System.out.println(s.name);
        System.out.println(s.age);
    }
}
