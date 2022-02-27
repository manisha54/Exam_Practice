package polymorphism;

public class Shape {
    public float area(float radius){
        return (float) (3.14 * radius * radius);
    }
    public float area(float Lenght, float Breadth){
        return Lenght * Breadth;

    }
}
