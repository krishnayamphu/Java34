package exceptions;

public class ThrowDemo {
    public void voterAge(int age) throws ArithmeticException{
        if(age>=18){
            System.out.println("You are eligible to vote.");
        }else{
            throw new ArithmeticException("Age is bellow 18");
        }
    }

    public static void main(String[] args) {
        ThrowDemo td=new ThrowDemo();
        try{
            td.voterAge(15);
        }catch (ArithmeticException e){
            System.err.println(e);
            System.err.println("You are under 18");
        }
    }
}
