package class7.Homework;

public class NumbersFrom100To1 {
    public static void main(String[] args) {

        int num=100;
        while (num>=1) {
            System.out.print(num+" ");
            num--;
        }
        System.out.println();
        for (int i = 100; i>=1; i--) {

            System.out.print(i+" ");
        }
        System.out.println();
        int num2=100;
        do {
            System.out.print(num2+" ");
            num2--;
        }
        while (num2>=1);
    }
}
