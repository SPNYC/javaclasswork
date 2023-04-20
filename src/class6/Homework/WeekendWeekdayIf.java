package class6.Homework;

import java.util.Scanner;

public class WeekendWeekdayIf {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the day");
        int day=scanner.nextInt();

        if  (day>=1 && day<=5) {
            System.out.println("It is a weekday");
        }
        else if(day==6 || day==7){
            System.out.println("It is a weekend");
        }
        else {
            System.out.println("Invalid day");
        }
    }
}
