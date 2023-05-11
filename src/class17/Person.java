package class17;

public class Person {
    String name;
    Person(){
        System.out.println("No arguments");
    }
    Person(String personName){
        name=personName;
        System.out.println("1 argument");
    }

    public static void main(String[] args) {
        Person person=new Person();
        Person person1=new Person("Tom");
    }
}
