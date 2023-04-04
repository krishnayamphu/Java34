package inheritance;

public class TypeCasting {
    public static void main(String[] args) {
        int a=10,b;
        double x=a; //up casting automatically performed
        System.out.println(x);

        double y=20.5;
        b= (int) y;
        System.out.println(b);


    }
}
