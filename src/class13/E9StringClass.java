package class13;

public class E9StringClass {
    public static void main(String[] args) {

        String str="Wife";
        str.toLowerCase(); //stay the same
        System.out.println(str);

        StringBuilder str2=new StringBuilder("Husband");
        str2.reverse(); //will be changed
        System.out.println(str2);
    }
}
