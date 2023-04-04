package inheritance;
//final class Test
class Test{
    public void test(){
        System.out.println("Test something here");
    }
}
public class FinalClassDemo extends Test{
    public static void main(String[] args) {
        FinalClassDemo fd=new FinalClassDemo();
        fd.test();
    }
}
