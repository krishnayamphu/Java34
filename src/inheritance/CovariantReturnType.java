package inheritance;
class Fruit{
    public Fruit get(){
        return this;
    }
}
class Apple extends Fruit{
    public Apple get(){
        return this;
    }
    public void getTaste(){
        System.out.println("Apple taste is sweet.");
    }
}
public class CovariantReturnType {
    public static void main(String[] args) {
        new Apple().get().getTaste();
    }
}
