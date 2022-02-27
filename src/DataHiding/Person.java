package DataHiding;

public class Person {
    //data hiding
    private int age;


    //Getter
    public int getAge() {
        return age;
    }
    //Setter

    public void setAge(int age) {
        this.age = age;
    }
}

class testPerson{
    public static void main(String[] args) {
        Person obj = new Person();
        obj.setAge(22);
        System.out.println("the age of person  is " + obj.getAge());

    }
}



