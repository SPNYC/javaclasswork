package class4.Homework;

import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the loan amount you needed");
        int loan= scanner.nextInt();

        if(loan<=200000){
            System.out.println("The Bank will lend you the money");
        }
        else System.out.println("Your loan request is rejected");
    }
}
