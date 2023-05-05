package stringhandling;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Aptech");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.append(" Computer"));
        System.out.println(sb.equals("apt"));
        System.out.println(sb.deleteCharAt(2));
        System.out.println(sb.indexOf("h"));
        System.out.println(sb.reverse());
    }
}
