package class15;

public class E5 {
    String name; //instance variables in violet color
    static int age=10; //could be used in any methods
    void print(){
        int age=10;// local in white color
        System.out.println(age);
        System.out.println(name);
        System.out.println(age);

    }
    void printInfo(){ //instance method
        System.out.println(name);
    }
    static void printName(){ //instance variables could not be static
        //System.out.println(name); //shows error, name in red color
        System.out.println(age);
    }

    public static void main(String[] args) {
        System.out.println(Math.E);
    }
}
