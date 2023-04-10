package abstraction;
abstract class Printable{
    public Printable(){
        System.out.println("Ready to print");
    }
    abstract void print();
}

class MyPrinter extends Printable{

    @Override
    void print() {
        System.out.println("Printing Hello World.");
    }
}
public class AbstractMethod {
    public static void main(String[] args) {
        MyPrinter printer=new MyPrinter();
        printer.print();
    }
}
