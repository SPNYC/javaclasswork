package class9;

public class E8Arrays {
    public static void main(String[] args) {

        /*
        create an array store 10,50,60,45,100 then print elements which
        are present on odd indexes
        expected out 50 45
         */
        int[] numbers = {10, 50, 60, 45, 100};

        for (int i = 0; i < numbers.length; i++) { //=for (int i=1; i < numbers.length; i+=2;
            if (i % 2 != 0) {                      // = if (i%2=0)
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
