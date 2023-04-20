package class9;

public class E4Arrays {
    public static void main(String[] args) {

        double[] numbers = {10.5, 5.5, 0.05, 100.5, 586};

        System.out.println(numbers.length); //numbers.length gives us the total count of elements in an array
        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j] + " ");
        }
    }
}
