package class6.Homework;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1=scanner.nextInt();

        System.out.println("Please enter the second number");
        int num2= scanner.nextInt();

        System.out.println("Please enter the operator");
        String operator=scanner.next();

        if(operator.equals("+")){
          int  sum=num1+num2;
            System.out.println(sum);
        }
        else if(operator.equals("-")){
            int sub=num1-num2;
            System.out.println(sub);
        }
        else if(operator.equals("*")){
            int mul=num1*num2;
            System.out.println(mul);
        }
        else if(operator.equals("/")){
            int div=num1/num2;
            System.out.println(div);
        }
    }
}
