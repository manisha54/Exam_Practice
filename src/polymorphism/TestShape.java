package polymorphism;

public class TestShape {
    public static void main(String[] args) {
        Circle obj = new Circle();
        System.out.println("The area of circle is : "+ obj.area(3));

        Rectangle obj1 = new Rectangle();
        System.out.println("The area of rectangle is : " + obj1.area(2, 3));
    }
}
