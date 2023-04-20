package class6.Homework;

import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1=scanner.nextInt();

        System.out.println("Please enter the second number");
        int num2= scanner.nextInt();

        System.out.println("Please enter the operator");
        String operator=scanner.next();

        switch (operator){
            case "+":
                int  sum=num1+num2;
                System.out.println(sum);
                break;
            case "-":
                int sub=num1-num2;
                System.out.println(sub);
                break;
            case "*":
                int mul=num1*num2;
                System.out.println(mul);
                break;
            case"/":
                int div=num1/num2;
                System.out.println(div);
        }
        }
    }

