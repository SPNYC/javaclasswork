package class7.Homework;

public class NumbersFrom1To100 {
    public static void main(String[] args) {

        int num=1;
        while (num<=100){
            System.out.print(num+" ");
            num++;
        }
        System.out.println();
        for (int i = 1; i <=100; i++) {

            System.out.print(i+" ");
        }
        System.out.println();
        int num2=1;
        do {
            System.out.print(num2+" ");
            num2++;
        }
        while (num2<=100);
    }
}
