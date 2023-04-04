package inheritance;
class Animal{
    public String color;
    public int weight;
}
public class Dog extends Animal{
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.color="brown";
        dog.weight=20;
        System.out.println("Dog color:"+dog.color);
        System.out.println("Dog weight:"+dog.weight);
    }
}
