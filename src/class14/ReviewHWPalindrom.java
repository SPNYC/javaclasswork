package class14;

public class ReviewHWPalindrom {
    boolean isPalindrome(String str){
        String lowerCaseStr=str.toLowerCase();

        String reversedStr="";
        for (int i = str.length()-1; i >=0; i--) {
            reversedStr=reversedStr+str.charAt(i);
        }
        boolean isPalindrome=false;
        if (str.equalsIgnoreCase(reversedStr)){
            isPalindrome=true;
        }
        return isPalindrome;
    }

    boolean isPalindromeSB(String str){
  /*
   new StringBuilder(str)=> converts the String to a StringBulder
   reverse()=>it reverse the contents in StringBuilder
   toString()=> it converts StringBuilder to back to s String
  equalsIgnoreCase(str) => compare reversed str and str
      */
        return new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);
    }
    public static void main(String[] args) {
        ReviewHWPalindrom palindrome=new ReviewHWPalindrom();
        boolean result=palindrome.isPalindrome("madam");
        System.out.println(result);
    }

}
