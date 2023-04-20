package class4.Homework;

import java.util.Scanner;

public class CityTemperature {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your City");
        String city= scanner.next();
        System.out.println("Enter the Temperature in F");
        double tempF=scanner.nextInt();

       double tempC=(tempF-32)/1.8;

        System.out.println("The temperature is "+tempC+ "C"+" the city is "+city);
    }
}
