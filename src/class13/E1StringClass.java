package class13;

public class E1StringClass {
    public static void main(String[] args) {


        String str = "Batch 16 is good";
        str=str.replace("good","excellent"); //updated str
        //System.out.println(str.replace("good","excellent"));
        System.out.println(str); //if without updated str it will be original str
        System.out.println(str.replace('e','E'));

    }
}