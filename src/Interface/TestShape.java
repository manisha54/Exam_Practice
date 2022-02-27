package Interface;

public class TestShape {
    public static void main(String[] args) {
        Circle obj = new Circle(2);
        System.out.println("The area of circle is " + obj.area());
        System.out.println( obj.draw());
    }
}
