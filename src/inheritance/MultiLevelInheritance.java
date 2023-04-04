package inheritance;
class A{
    int a;
}
class B extends A{
    int b;
}
class C extends B{
    int c;
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        C ob=new C();
        ob.a=10;
        ob.b=20;
        ob.c=30;

        System.out.println(ob.a);
        System.out.println(ob.b);
        System.out.println(ob.c);
    }

}
