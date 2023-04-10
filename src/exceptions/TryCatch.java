package exceptions;

public class TryCatch {
    public static void main(String[] args) {
        try{
            System.out.println(10/2);
            System.out.println("hello");
        }catch (ArithmeticException e){
            System.err.println(e);
            System.err.println("Number can't / by zero");
        }


    }
}
