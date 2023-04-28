package class13;

public class MethodTester {
    public static void main(String[] args) {


        Printer obj = new Printer();
        obj.printSomething();
        obj.printSomething();

        obj.printWord("Darko"); //will be printed so many time, how many is in Printer printWord
        obj.printWord("Artem Lean");

        obj.printWordManyTimes("Lean",10);
    }
}
