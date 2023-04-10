package exceptions;

public class FinallyBlock {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.err.println(e);
        }finally {
            System.out.println("Finally block reached.");
        }
    }
}
