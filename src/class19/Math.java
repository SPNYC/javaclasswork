package class19;

public class Math {
    //method overloading. Same names for methods, but with different data types parameters
   static  void add (int num1, int num2){
        System.out.println(num1+num2);
    }
static void add(int num1, double num2){
    System.out.println(num1+num2);
}
    static void add(double num1, int num2){
        System.out.println(num1+num2);
    }
static void add(double num1,double num2){
    System.out.println(num1+num2);
}
static void add(int num1,long num2){
    System.out.println(num1+num2);
}
    static void add(int num1,double num2, int num3){
        System.out.println(num1+num2+num3);
    }
    public static void main(String[] args) {
       add(10,10);
        add(10,20.5);
        add(2.5,2.5);
        add(40000000000L,86586500000L);
        add(45,4.5,45);
        add(2.5,65);

    }
}
