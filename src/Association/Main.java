package Association;

public class Main {
    public static void main(String[] args) {

        System.out.println("from student ");
        Student obj = new Student("Manisha Tharu", "100");
        System.out.println("student fullname is " + obj.fullname);
        System.out.println("student id is " + obj.id);

        System.out.println("\n from Adress");
        Address obj1=new Address("nepal", 1);
        System.out.println("Student's address is " + obj1.getCountry());
        System.out.println("Student's wardno is " + obj1.getWardno());

    }
}
