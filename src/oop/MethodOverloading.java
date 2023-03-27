package oop;

public class MethodOverloading {
    public void sum(){
        System.out.println("default sum method");
    }
    public void sum(int x, int y){
        System.out.println("Total sum: "+(x+y));
    }
    public void sum(double x, double y){
        System.out.println("Total : "+(x+y));
    }
    public static void main(String[] args) {
        MethodOverloading ob=new MethodOverloading();
        ob.sum();
        ob.sum(10d,5d);
    }
}
