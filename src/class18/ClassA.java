package class18;

public class ClassA {
    static void printF(){
        System.out.println("-------");
    }

    public static void main(String[] args) {

        B b = new B();
        b.printF();

    }
}
class B extends ClassA{

}
class C extends B{
    
}

