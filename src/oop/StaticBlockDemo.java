package oop;

public class StaticBlockDemo {
    static int a;
    static {
        a=4;
        System.out.println("i am static block");
    }

    public static void main(String[] args) {
        System.out.println("i am main method");
        System.out.println(a);
    }
}
