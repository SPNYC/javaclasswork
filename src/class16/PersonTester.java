package class16;

public class PersonTester {
    public static void main(String[] args) {
        Person person=new Person();
      //  person.password="ksjhg"; doesnt work
        //person.printPassword();
       // Person.printBalance(); - no access, because it private
        System.out.println(person.SNN);
        System.out.println(person.name);
    }
}
