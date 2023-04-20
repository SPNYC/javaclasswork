package class6.Homework;

import java.util.Scanner;

public class GradeExplanationSwitch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your grade");
        String grade=scanner.next();

        switch (grade) {
            case "A":
                System.out.println(grade+" -Excellent");
                break;
            case "B":
                System.out.println(grade+" -Good");
                break;
            case "C":
                System.out.println(grade+" -Average");
                break;
            case"D":
                System.out.println(grade+" -Bad");

            default:
                    System.out.println("Not Acceptable");}

        }
    }

