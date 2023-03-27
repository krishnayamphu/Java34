package oop;

public class ABC {
    public void test() {
        System.out.println("This is just a test method");
    }

    private void hello() {
        System.out.println("Say Hello!");
    }

    private int getMaxSpeed() {
        return 200;
    }

    private String getCompanyName() {
        return "ABC Co. Ltd.";
    }

    public void sum(int x, int y) {
        System.out.println("Total sum: " + (x + y));
    }

    public void empInfo(String name, String address, int age) {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Address: " + address);
        System.out.println("Employee Age: " + age);
    }

    public double getDiscontAmount(double price, double discount_percentage) {
        double discount = price * discount_percentage / 100;
        return discount;
    }

    public static void main(String[] args) {
        ABC abc = new ABC(); //object created
        abc.test();
        abc.test();

        abc.hello();
        System.out.println("=======================");
        System.out.println("Bike max speed:" + abc.getMaxSpeed());
        System.out.println("Company Name: " + abc.getCompanyName());
        System.out.println("=======================");
        abc.sum(10, 5);
        System.out.println("=======================");
        abc.empInfo("Ram", "Patan", 26);
        System.out.println("=======================");
        System.out.println("Discount: " +abc.getDiscontAmount(10000, 5));
    }
}
