package class9;

public class E7Arrays {
    public static void main(String[] args) {
        /*
        create an array of chars and you have to print all the chars
        on even indexes {a,b,c,d,e}-> a c e
         */
        char [] symbol={'a','b','c','d','e'};
        for (int j = 0; j < symbol.length ; j+=2) {

            System.out.print(symbol[j] + " ");
        }
    }
}
