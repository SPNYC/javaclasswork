package class6.Homework;

import java.util.Scanner;

public class WeekendWeekday {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the day");
        int day=scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("It is a weekday");
                break;
            case 2:
                System.out.println("It is a weekday");
                break;
            case 3:
                System.out.println("It is a weekday");
                break;
            case 4:
                System.out.println("It is a weekday");
                break;
            case 5:
                System.out.println("It is a weekday");
                break;
            case 6:
                System.out.println("It is a weekend");
                break;
            case 7:
                System.out.println("It is a weekend");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
