package class14.Homework;

public class HelloDifLanguages {
    /*
    Create a method that will say Hello in different language
    based on the country that will passed when method is executed.
     */
    void printHello(String country) {
        switch (country) {
            case "USA":
            System.out.println("Hello");
            break;
            case "Spain":
                System.out.println("Hola");
                break;
            case "Finland":
                System.out.println("Hei");
                break;
            case "Russia":
                System.out.println("Привет");
                break;
        }
    }

    public static void main(String[] args) {
        HelloDifLanguages w=new HelloDifLanguages();
        w.printHello("USA");

        HelloDifLanguages w1=new HelloDifLanguages();
        w1.printHello("Spain");

        HelloDifLanguages w2=new HelloDifLanguages();
        w2.printHello("Finland");

        HelloDifLanguages w3=new HelloDifLanguages();
        w3.printHello("Russia");
    }
}
