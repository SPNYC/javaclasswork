package class13;

public class E10StringClass {
    public static void main(String[] args) {

        StringBuilder str= new StringBuilder("1");
        for (int i = 0; i < 100; i++) {
            str.append(i);
        }
        System.out.println(str);

    }
}
