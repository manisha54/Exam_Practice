package Abstraction;

public class TestShape {
    public static void main(String[] args) {
        Circle obj = new Circle(2);
        System.out.println("the area of circle is "+ obj.area());

        Rectangle obj1 = new Rectangle(2, 4);
        System.out.println("The area of rectangle is" + obj1.area());
    }
}
