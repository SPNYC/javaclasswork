package class6.Homework;

import java.util.Scanner;

public class MonthOfBirthSwitch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("PLease enter you month of birth");
        String month=scanner.next();

        switch(month) {
            case "December":
                System.out.println("You were born in Winter");
                break;
            case "January":
                System.out.println("You were born in Winter");
                break;
            case "February":
                System.out.println("You were born in Winter");
                break;
            case "March":
                System.out.println("You were born in Spring");
                break;
            case "April":
                System.out.println("You were born in Spring");
                break;
            case "May":
                System.out.println("You were born in Spring");
                break;
            case "June":
                System.out.println("You were born in Summer");
                break;
            case "July":
                System.out.println("You were born in Summer");
                break;
            case "August":
                System.out.println("You were born in Summer");
                break;
            case "September":
                System.out.println("You were born in Fall");
                break;
            case "October":
                System.out.println("You were born in Fall");
                break;
            case "November":
                System.out.println("You were born in Fall");
        }

    }
}
