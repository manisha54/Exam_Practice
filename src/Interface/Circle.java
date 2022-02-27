package Interface;

public class Circle implements Shape{

    private float radius;

    //cons
    Circle(float radius){
        this.radius=radius;
    }

    @Override
    public float area() {
        return (float) (3.14 * radius * radius);
    }

    @Override
    public String draw() {
        return "I am circle";
    }
}
