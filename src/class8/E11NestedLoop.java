package class8;

public class E11NestedLoop {
    public static void main(String[] args) {

        // use one while and one for loop 1:59
    /*
    2 4 6 8 10
    2 4 6 8 10
    2 4 6 8 10
    2 4 6 8 10
     */

        int counter = 0;
        while (counter < 4) {
            for (int i = 2; i <= 10; i = i + 2) {
                System.out.print(i + " ");
            }
            System.out.println();
            counter++;
        }
    }
}



