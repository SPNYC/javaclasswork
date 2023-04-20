package class6.Homework;

import java.util.Scanner;

public class MonthOfBirth {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter you month of birth");
       String birthMonth= scanner.next();

       if (birthMonth.equals("December") || birthMonth.equals("January") || birthMonth.equals("February")){
           System.out.println("You were born on Winter");
       }
       else if(birthMonth.equals("March") || birthMonth.equals("April") || birthMonth.equals("May")){
           System.out.println("You were born in Spring");
       }
       else if(birthMonth.equals("June") || birthMonth.equals("July") || birthMonth.equals("August")){
           System.out.println("You were born in Summer");
       }
       else if(birthMonth.equals("September") || birthMonth.equals("October") || birthMonth.equals("November")){
           System.out.println("You were born in Fall");
       }
    }
}
