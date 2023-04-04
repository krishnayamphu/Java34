package inheritance;
class Vehicle{
    public void start(){
        System.out.println("Starting Vehicle");
    }
}
class Bike extends Vehicle{
    @Override
    public void start(){
        System.out.println("Starting Bike");
    }
}
class Car extends Vehicle{
    @Override
    public void start(){
        System.out.println("Starting Car");
    }
}
public class MethodOverride {
    public static void main(String[] args) {
        Vehicle bike=new Bike();
        Vehicle car=new Car();
        bike.start();
        car.start();
    }
}
