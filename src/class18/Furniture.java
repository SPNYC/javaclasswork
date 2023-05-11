package class18;

public class Furniture { //super. to get from base(parent) class
    String color="Black";


}
class Chair extends Furniture{
    String color="White";
    void printColor() {
        String color = "Blue";
        System.out.println(color);//blue
        System.out.println(this.color); //white
        System.out.println(super.color); //black
    }
}


class FurnitureTester{
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printColor();
    }
}