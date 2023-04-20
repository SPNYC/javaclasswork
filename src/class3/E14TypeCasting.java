package class3;

public class E14TypeCasting {
    public static void main(String[] args) {

        short num=1200;
        byte num2=(byte)num; // -80, erroe, we loose the data
        System.out.println(num2);

        short num3=126;
        byte num4=(byte)num3;//type casting
        System.out.println(num4);


    }
}
