package Abstraction;

public class Circle extends Shape{
    private float radius;
    //
    Circle(float radius){
        this.radius =radius;
    }
    @Override
    protected float area() {
        return (float) (3.14 * radius * radius);
    }
}
