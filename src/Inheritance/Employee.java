package Inheritance;

 class Employee {
    float salary=5;
    float dashainbonus= 2;

}
class Programmer extends Employee{
     int bonus=3;

    public static void main(String[] args) {
        Programmer obj = new Programmer();
        System.out.println("Programmer salary is " + obj.salary);
        System.out.println("Programmer dashainbonus is " + obj.dashainbonus);
        System.out.println("Programmer bonus is " + obj.bonus);

        float totalSalary = obj.salary + obj.bonus + obj.dashainbonus;
        System.out.println("The total salary of employee is  " + totalSalary);
    }

}
