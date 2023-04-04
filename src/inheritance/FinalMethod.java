package inheritance;
class Bird{
    public final void eat(){
        System.out.println("eating food");
    }
}
class Sparrow extends Bird{
//    @Override
//    public void eat() {
//        System.out.println("Sparrow eating rice");
//    }
}
public class FinalMethod {
    public static void main(String[] args) {
        Sparrow sparrow=new Sparrow();
        sparrow.eat();
    }
}
