package inheritance;

class Mobile {
    public String brand;
    public String model;
    public void testMobile(String mobile){
        System.out.println("Testing Mobile: "+mobile);
    }
}

class Samsung extends Mobile {
    public String color;

    public void deviceInfo() {
        super.brand = "Samsung";
        super.model = "Galaxy S20";
        color = "Silver";
        System.out.println("Brand Name: " + super.brand);
        System.out.println("Model: " + super.model);
        System.out.println("Color: " + color);
    }

    public void deviceTest(){
        super.testMobile("Galaxy m32");
    }

}

public class SuperKeyword {
    public static void main(String[] args) {
        Samsung samsung = new Samsung();
        samsung.deviceInfo();
        samsung.deviceTest();
    }
}
