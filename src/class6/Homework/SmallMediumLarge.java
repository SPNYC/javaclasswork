package class6.Homework;

import java.util.Scanner;

public class SmallMediumLarge {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scanner.nextInt();

        if(num>=1 && num<=10){
            System.out.println("The number is small");
        } else if (num>=11 && num<=100) {
            System.out.println("The number is medium");
        }
        else if(num>=101 && num<=1000){
            System.out.println("The number is large");
        }
        }
    }

