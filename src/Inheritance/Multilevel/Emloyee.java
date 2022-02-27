package Inheritance.Multilevel;

class Emloyee {
    float salary=5;

}
class programmer extends Emloyee{
    int bonus =3;
}
class sub_programmer extends programmer{
    int extrasalary=2;

    public static void main(String[] args) {
        sub_programmer obj = new sub_programmer();
        System.out.println("bonus of subprogrammer " + obj.bonus);
        System.out.println("extrasalary of subprogrammer " + obj.extrasalary);
        System.out.println("salary of subprogrammer " + obj.bonus);

        float totalSalary = obj.salary + obj.bonus + obj.extrasalary;
        System.out.println("The total salary of employee is  " + totalSalary);
    }

}


