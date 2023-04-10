package exceptions;

public class MultiCatchBlock {
    public static void main(String[] args) {
        try{
            System.out.println(10/1);
            int[] num=new int[2];
            num[0]=10;
            num[1]=20;
            System.out.println(num[5]);

        }catch (ArithmeticException e){
            System.err.println(e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }
    }
}
