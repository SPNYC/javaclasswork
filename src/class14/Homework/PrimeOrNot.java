package class14.Homework;

public class PrimeOrNot {
    /*
    Write a method to return whether given number is prime or not?
     */

    boolean isPrime(int num) {


        boolean isPrimeNum = true;
        if (num > 1) {
            for (int i = 2; i < num; i++) {

                if (num % i == 0) {
                    isPrimeNum = false;
                    break;
                }
            }
        } else {
            isPrimeNum = false;
        }
        return isPrimeNum;
    }



    public static void main(String[] args) {
        PrimeOrNot p=new PrimeOrNot();
      int  num=12;
              boolean num1=p.isPrime(num);
        System.out.println(num1);
    }
}
