package class7;

public class E10WhileLoop {
    public static void main(String[] args) {
        //1 2 3 4 5 7 8 10 11 13

        int num = 1;
        while (num <= 13) {
            if (num != 6 && num != 9 && num != 12) {
                System.out.print(num + " ");
            }
            num++;
        }
    }
}
