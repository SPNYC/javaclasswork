package class16.Homework;

public class onlyVowels {
    /*
    Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
     Method should be available inside the class only where it was declared and executed by calling it is name.
     */
    private String consistOnlyVowels(String str){
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                System.out.print(ch);
            }
        }
        return str;
    }

    public static void main(String[] args) {
        onlyVowels getVowels=new onlyVowels();
        getVowels.consistOnlyVowels("abrakadabraeeeiiiuuu");
    }
}
