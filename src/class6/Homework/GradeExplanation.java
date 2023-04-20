package class6.Homework;

import java.util.Scanner;

public class GradeExplanation {
    public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your grade");
        String grade=scanner.next();

        if(grade.equals("A")){
            System.out.println(grade+" -Excellent");
        }
        else if(grade.equals("B")){
            System.out.println(grade+" -Good");
        }
        else if (grade.equals("C")){
            System.out.println(grade+" -Average");
        }
        else if(grade.equals("D")){
            System.out.println(grade+" - Bad");
        }
        else {
            System.out.println("Not Acceptable");
        }
    }
}
