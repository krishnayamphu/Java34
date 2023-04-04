package inheritance;
class Address{
        String toll;
        String city;
        String state;
}
class Student{
        String name;
        Address address; //aggregation obj
}
public class AggregationDemo{
        public static void main(String[] args) {
                Student s=new Student();

                s.name="Ramesh";
                s.address=new Address();
                s.address.toll="Patan";
                s.address.city="Lalitpur";
                s.address.state="Bagmati";

                System.out.println("Student Name: "+s.name);
                System.out.println("Student Address: "+s.address.toll+", "+s.address.city+", "+s.address.state);
        }
}
