package oop;

public class Person {
    private String name;
    private int age;
    public Person(Person person){
        this.name=person.name;
        this.age=person.age;
    }
    public Person(){};


    public void personInfo(Person person){
        System.out.println("Person Name: "+person.name);
        System.out.println("Person Age: "+person.age);
    }
    public void showDetails(){
        personInfo(this);
    }

    public void test(){
        new Person(this);
    }
    public Person getPersonObject(){
        return this;
    }

    public static void main(String[] args) {
        Person person=new Person();
        person.name="Ramesh";
        person.age=20;
        person.showDetails();
        person.test();
        System.out.println("===========================");
        Person p=new Person().getPersonObject();
        p.name="Hari";
        p.age=22;
        p.showDetails();
    }
}
