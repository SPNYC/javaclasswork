package class16;

public class Person {

    public String name="Vlad";
    String SNN="123345";
    private String password;
   private static double bankBalance=12000;
    private void printPassword(){
        System.out.println(password);
    }
private static void printBalance(){
    System.out.println(bankBalance);
}
    public static void main(String[] args) {
        Person farwa=new Person();
        farwa.password="1345136";
        farwa.printPassword();
        System.out.println(Person.bankBalance);
        System.out.println(farwa.SNN);
        System.out.println(farwa.name);



    }
}
