package abstraction;
abstract class Fruit{
    String name;
}
public class AbstractDemo  extends Fruit{
    public static void main(String[] args) {
//        Fruit apple=new Fruit();
        AbstractDemo mango=new AbstractDemo();
        mango.name="Mango";
        System.out.println(mango.name);
    }
}
