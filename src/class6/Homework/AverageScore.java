package class6.Homework;

import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your quiz scores");
        int quiz=scanner.nextInt();

        System.out.println("Enter your mid term scores");
        int midterm=scanner.nextInt();

        System.out.println("Enter your final scores");
        int finalScore=scanner.nextInt();

        int averageScore=(quiz+midterm+finalScore)/3;

        if(averageScore>=90){
            System.out.println("Grade=A");
        }
        else if(averageScore>=70 && averageScore<90){
            System.out.println("Grade=B");
        }
        else if(averageScore>=50 && averageScore<70){
            System.out.println("Grade=C");
        }
        else if(averageScore<50){
            System.out.println("Grade=F");
        }
    }
}
