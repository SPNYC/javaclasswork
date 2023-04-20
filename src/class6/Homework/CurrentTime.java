package class6.Homework;

import java.util.Scanner;

public class CurrentTime {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please input the current time");
        int time= scanner.nextInt();

        if(time>=1 && time<=11){
            System.out.println("Morning");
        }
        else if(time>=12 && time<=15){
            System.out.println("Afternoon");
        }
        else if(time>=16 && time<=20){
            System.out.println("Evening");
        }
        else if (time>=21 && time<=24){
            System.out.println("Night");
        }
    }
}
