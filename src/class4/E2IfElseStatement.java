package class4;

public class E2IfElseStatement {
    public static void main(String[] args) {
        // we can't use "==" with String
        //we need to use .equals()
        String name="Jacob";
// name.equals("Corey")=> else condition will be executed
        if(name.equals("Jacob"))
        {
            System.out.println("I like swimming");
        }
        else
        {
            System.out.println("I like programming");
        }
    }
}
