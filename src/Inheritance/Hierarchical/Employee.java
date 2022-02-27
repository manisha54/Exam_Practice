package Inheritance.Hierarchical;

class Employee {
    float salary=5;
}
class Parttime_Employee extends Employee{
    int bonus=10;

}
class fulltime extends  Employee{
    int bonus1=20;
}
class testemployee{
    public static void main(String[] args) {
        Parttime_Employee obj =new Parttime_Employee();
        System.out.println("bonnus of parttime : " + obj.bonus);
        System.out.println("salary of parttime : " + obj.salary);
        float totalsalary = obj.salary+obj.bonus;
        System.out.println("the total salary of Employee is " + totalsalary);

        System.out.println("\n from salary of employee of parttime");

        fulltime obj1 = new fulltime();
        System.out.println("bonnus of fultime : " + obj1.bonus1);
        System.out.println("salary of fultime : " + obj1.salary);
        float totalsalary1 = obj1.salary+obj1.bonus1;
        System.out.println("the total salary of Employee is " + totalsalary1);


    }
}