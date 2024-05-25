package Lab3;

import java.util.Scanner;

//Business hours
public class Enum_3b {
    enum Days {
        SUNDAY("11am TO 5pm"),
        MONDAY("9am to 9pm"),
        TUESDAY("9am to 9pm"),
        WEDNESDAY("9am to 9pm"),
        THURSDAY("9am to 9pm"),
        FRIDAY("9am to 9pm"),
        SATURDAY("10am to 6pm");

        private final String hours;

        Days(String hours) {
            this.hours = hours;
        }
        public String getHours() {
            return hours;
        }
    }

    public static void main(String[] args) {
        //display all days and their business hours
        for (Days day : Days.values()) {
            /*System.out.println(day + " : " + day.getHours()); */
            System.out.print(day +",");
        }System.out.println();
        //prompt a user for a day and display business hour for that day
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day of the week: ");
        String inputDay = sc.nextLine().toUpperCase();

        try{
            Days selectedDay = Days.valueOf(inputDay);
            System.out.println("Business hours on " + selectedDay + " : "
                    + selectedDay.getHours());
        }catch(IllegalArgumentException e){
            System.out.println("Invalid day: " + inputDay);
        }
        sc.close();
    }
}
