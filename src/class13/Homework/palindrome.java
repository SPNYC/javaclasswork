package class13.Homework;

public class palindrome {
    public static void main(String[] args) {

        //How would you check if String is palindrome or not? aba=> true
        //Abbc =>false

        String str ="abba";
        boolean isPalindrome=true;

        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }
       System.out.println(isPalindrome);

        }
    }

