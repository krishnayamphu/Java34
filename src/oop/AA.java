package oop;

public class AA {
    /**
     * this.member
     * this.method()
     */
    private int x,y;

    public void calc(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void test(){
        System.out.println("Testing java code.");
    }
    public void show(){
        this.test();
    }

    public static void main(String[] args) {
        AA aa=new AA();
        aa.calc(10,20);
        System.out.println(aa.x);
        System.out.println(aa.y);

        System.out.println("===============");
        aa.show();
    }
}
