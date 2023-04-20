package class9.Homework;

public class sumofArray {
    public static void main(String[] args) {

        int [] numbers={12,23,34,45,56};
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i];
        }
        System.out.println(sum);
    }
}
