package class4.Homework;

import java.util.Scanner;

public class DMV {
    public static void main(String[] args) {

        Scanner scanner=new Scanner (System.in);
        System.out.println("Please enter your age");
        int age= scanner.nextInt();

        if(age>=18){
            System.out.println("Your driver license will be issued");
        }
        else System.out.println("You are allowed to get you learning permit only");
    }
}
