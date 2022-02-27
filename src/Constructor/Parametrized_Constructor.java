package Constructor;

public class Parametrized_Constructor {
    String flowers;

    //constructor
    Parametrized_Constructor(String flowers){
        this.flowers = flowers;
        System.out.println("the different type of flowers are : " + flowers);
    }

    public static void main(String[] args) {
        Parametrized_Constructor obj = new Parametrized_Constructor("Lotus");
        Parametrized_Constructor obj1 = new Parametrized_Constructor("Rose");
        Parametrized_Constructor obj3 = new Parametrized_Constructor("Lilly");


    }
}
