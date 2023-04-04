package oop;

public class ThisDemo {
    /**
     * this()
     */
    public ThisDemo(){
        System.out.println("Default Constructor");
    }

    public ThisDemo(String s){
        this();
        System.out.println(s);
    }
    public static void main(String[] args) {
        ThisDemo demo=new ThisDemo("Hello World");
    }
}
