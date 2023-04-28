package class13;

public class E7StringClass {
    public static void main(String[] args) {

        /*
        You have s String a="Is it Saturday? Is it Raining? Do we have a Java Class today?"
        how would you find out how many sentences are in that String?

         */
        String a="Is it Saturday? Is it Raining? Do we have a Java Class today?";
        String [] aArr=a.split("[?]");
        System.out.println(aArr.length);


    }
}
