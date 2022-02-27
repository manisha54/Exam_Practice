package Mutable_Immutable;

public class Test_Mutable {
    public static void main(String[] args) {
        Mutable obj = new Mutable(2, 3);
        System.out.println("sum is "+ obj.add());

        obj.setFirst(3);
        System.out.println("sum is " + obj.add());
    }
}
