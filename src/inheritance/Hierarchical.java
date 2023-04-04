package inheritance;
class Shape{
    public void draw(String shape){
        System.out.println("Drawing "+shape);
    }
}
class Circle extends Shape{

}
class Rectangle extends Shape{

}
public class Hierarchical {
    public static void main(String[] args) {
        Shape circle=new Circle();
        Shape rectangle=new Rectangle();
        circle.draw("Circle");
        rectangle.draw("Rectangle");
    }
}
