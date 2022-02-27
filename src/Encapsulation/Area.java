package Encapsulation;

public class Area {
    int lenght;
    int breadth;

    //constructor
   public Area (int lenght, int breadth){
        this.lenght = lenght;
        this.breadth = breadth;
    }
    //Methods

    public void getArea(){
        int area = lenght * breadth;
        System.out.println("The area of rectangle is " + area);
    }

    public static void main(String[] args) {
        Area obj = new Area(2, 3);
        obj.getArea();

    }

}
