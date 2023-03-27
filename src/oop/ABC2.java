package oop;

public class ABC2 {
    public ABC2(){
        System.out.println("Hi, i am default constructor ");
    }
    public ABC2(String s){
        System.out.println("Hello Constructor");
    }
    public void test(){
        System.out.println("Hello world");
    }

    public static void main(String[] args) {
        new ABC2();
        new ABC2("HI");

        ABC2 a=new ABC2();
        a.test();
    }
}
