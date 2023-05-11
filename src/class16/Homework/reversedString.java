package class16.Homework;

public class reversedString {
    /*
    Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
     */
    public String revStr(String word){
        for (int i = word.length()-1; i >=0 ; i--) {
            System.out.print(word.charAt(i));

        }
        return word;
    }

    public static void main(String[] args) {
        reversedString str=new reversedString();
        str.revStr("hello");
    }
}
