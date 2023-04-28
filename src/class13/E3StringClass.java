package class13;

public class E3StringClass {
    public static void main(String[] args) {

        String str="fdghdfkgKDFGKGJK1345*^&%$^$%#%";

        System.out.println(str.replaceAll("[a-z]",""));//f replacement keep "" it will remove all low case letters
        System.out.println(str.replaceAll("[^a-z]",""));
        System.out.println(str.replaceAll("[^a-z0-9A-Z]","")); //do not replace low case letters from a-z and 0-9
        System.out.println(str.replaceAll("[Dn3]","*"));
        System.out.println(str.replaceAll("[a-z]","\\$"));

    }
}
