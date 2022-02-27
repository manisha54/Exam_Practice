package Abstraction;

public class Rectangle extends Shape {
    float l;
    float b;
    //
    Rectangle(float l, float b){
        this.l = l;
        this.b=b;
    }

    @Override
    protected float area() {
        return l * b;
    }
}
