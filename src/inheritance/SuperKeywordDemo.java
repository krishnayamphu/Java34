package inheritance;
class Bank{
    public Bank(String bankname){
        System.out.println(bankname+ " is created");
    }
}

class SanimaBank extends Bank{
    public SanimaBank(String bankname){
        super(bankname);
    }
}
public class SuperKeywordDemo {
    public static void main(String[] args) {
        SanimaBank bank=new SanimaBank("NMB");
    }
}
