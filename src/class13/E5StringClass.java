package class13;

public class E5StringClass {
    public static void main(String[] args) {
        /*
        Create a String that will hold a sentence. Write a program to get a new String without any spaces.
         */

        String str="I am   waiting for   Monday.";
        System.out.println(str.replaceAll(" ",""));
    }
}
