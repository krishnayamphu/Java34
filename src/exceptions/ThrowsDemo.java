package exceptions;

public class ThrowsDemo {
    public void calc(int n) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        System.out.println("Output: " + (200 / n));
        int[] num = new int[2];
        System.out.println(num[5]);
    }

    public static void main(String[] args) {
        ThrowsDemo td = new ThrowsDemo();
        try {
            td.calc(10);
        } catch (ArithmeticException e) {
            System.err.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e);
        }
    }
}
