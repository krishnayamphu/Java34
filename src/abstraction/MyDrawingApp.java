package abstraction;

public class MyDrawingApp implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing some kind of  shape");
    }

    public static void main(String[] args) {
        MyDrawingApp obj=new MyDrawingApp();
        obj.draw();
    }
}
