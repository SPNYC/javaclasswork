package class7;

import java.util.Scanner;

public class E14WhileLoop {
    public static void main(String[] args) {
        //ask the user for the number then print all the number from 1 till that number

        Scanner scanner=new Scanner (System.in);
        System.out.println("Enter the number");
        int number=scanner.nextInt();

        int counter=1;
        while (counter<=number){
            System.out.print(counter+" ");
            counter++;
        }
    }
}
