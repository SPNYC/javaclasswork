package class13.Homework;

public class swapTwoStrings {
    public static void main(String[] args) {

        // How would you swap  2 strings without a temporary variable?

        String str1="milk";
        String str2="cream";

        System.out.println(str1+" "+str2);

        str1=str1+str2;
        str2=str1.substring(0,str1.length()-str2.length());
        str1=str1.substring(str2.length());

        System.out.println(str1+" "+str2);
    }
}
