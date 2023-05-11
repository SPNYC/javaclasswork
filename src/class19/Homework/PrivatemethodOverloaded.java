package class19.Homework;

public class PrivatemethodOverloaded{
    /*
    Create 1 class with a private method that has 3 overloaded forms. Then call each overloaded method with specific arguments and observe result.

     */
    private static void Phone(String brand){
        System.out.println("Phone brand is "+brand);
    }
    private static void Phone(String color, int year){
        System.out.println("Color is "+color+", year "+year);
    }
    private static void Phone(int generation, int gb){
        System.out.println("Generation -"+generation+", "+gb+" Gb");
    }

    public static void main(String[] args) {
        PrivatemethodOverloaded.Phone("Samsung");
        PrivatemethodOverloaded.Phone("Black",2024);
        PrivatemethodOverloaded.Phone(10,128);
    }
}
