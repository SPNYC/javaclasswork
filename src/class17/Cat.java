package class17;

public class Cat {
    String name;
Cat(String catName){
    name=catName;
    System.out.println("1 agrument constructor called");
}

Cat(){
    System.out.println("0 argument constructor called");
}

Cat(int age){
    System.out.println("Int argument constructor");
}

Cat(double weight){
    System.out.println("Double argument constructor");
}
/*Cat(String color){
    System.out.println("1 argument"); //not allowed. you can make different constructors but with different types
}*/
    Cat(String name,String color){
        System.out.println("2 argument constructor called");
    }
    void printInfo(){
        System.out.println(name);
    }
    public static void main(String[] args) {

        Cat cat=new Cat("logie"); //any argument you can input here according constructors made in the class
        cat.printInfo();
    }
}
