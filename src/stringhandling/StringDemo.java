package stringhandling;

public class StringDemo {
    public static void main(String[] args) {
        String s="Hello";
        String ss=new String("Welcome");
        System.out.println(s.length());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        String s1=ss.substring(3);
        System.out.println(s1);
        System.out.println(ss.substring(3,6));
        System.out.println(ss.charAt(1));
        System.out.println(String.valueOf(500));
    }
}
