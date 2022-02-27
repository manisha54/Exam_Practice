package Encapsulation;

public class WeekDays{



// data hiding

    private String day;

// getter method --> accessing the value

    public String getDay(){

        return day;

    }

// setter method --> assigning the value

    public void setDay(String day){

        this.day = day;

    }

}

class Main{

    public static void main(String[] args){

        WeekDays d = new WeekDays();

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};



        for (String e: days){



            d.setDay(e); // invokes setDay method which writes the value

            System.out.println(d.getDay()); // invokes getDay method , which reads the value

        }

    }

}