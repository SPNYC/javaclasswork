package class13;

public class E6StringClass {
    public static void main(String[] args) {
/*
Create a String that should be combination of letters, numbers and special characters.
Find out how many Alphanumeric (abcAZ 284) characters are there in the String
 */
        String str="dfjkghLJHG14356#@#%";
        String newStr=str.replaceAll("[^a-zA-Z]","");
        System.out.println(newStr);
        System.out.println(newStr.length());
//        System.out.println(str.replaceAll("[^a-zA-z]","").length()); - same but in one line

    }
}
