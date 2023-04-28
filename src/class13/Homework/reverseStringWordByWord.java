package class13.Homework;

public class reverseStringWordByWord {
    public static void main(String[] args) {

// How would you reverse a String word by word

        String str = "This is sentence I want to reverse";
        System.out.println(str);
        String[] words = str.split(" ");
        System.out.println(words);
        for (String str1 : words) {
            for (int i = str1.length() - 1; i >= 0; i--) {
                System.out.print(str1.charAt(i));
            }
            System.out.print(" ");
        }
    }
}
