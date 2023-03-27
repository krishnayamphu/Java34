package oop;

public class Employee {
    private String name;
    private static String company="ABC";

    public static void companyInfo(){
        System.out.println("Company:"+company);
        System.out.println("Address: Kumaripati, Lalitpur");
    }

    public static void main(String[] args) {
        Employee e=new Employee();
        e.name="Ram";


        Employee ee=new Employee();
        ee.name="Hari";

        System.out.println("Name:"+e.name);
        System.out.println("Company:"+company);
        System.out.println("Name:"+ee.name);
        System.out.println("Company:"+company);

        companyInfo();
    }
}
