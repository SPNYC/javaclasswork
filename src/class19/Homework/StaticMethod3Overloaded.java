package class19.Homework;

public class StaticMethod3Overloaded {
    /*
    Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */

    static void PhoneInfo(String brand){
        System.out.println("Phone brand is "+brand);
    }
    static void PhoneInfo(String color, int year){
        System.out.println("Color is "+color+", year "+year);
    }
    static void PhoneInfo(int generation, int gb){
        System.out.println("Generation -"+generation+", "+gb+" Gb");
    }
}

