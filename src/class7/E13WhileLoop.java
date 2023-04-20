package class7;

public class E13WhileLoop {
    public static void main(String[] args) {
        //add all of the numbers from 1to 10 and display the result
        int sum=0;
        int num=1;

        while (num<=10) {
            sum+=num;//sum=sum+num
            num++;
        }
        System.out.println(sum);
        }
    }

