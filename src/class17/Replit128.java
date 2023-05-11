package class17;

public class Replit128 {
    static String mixString(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            sb.append(s1.charAt(i)).append(s2.charAt(i));
        }

        return sb.toString();


    }

    //test case below (dont change):
    public static void main(String[] args) {
        String firstValue = mixString("12345", "abcde");
        System.out.println(firstValue);
        String secondValue = mixString("howdy", "hello");
        System.out.println(secondValue);

    }
}
