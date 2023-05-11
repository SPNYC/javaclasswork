package class17.Homework;

public class Constractors4Test {
    public static void main(String[] args) {

        Constructors4 ob1=new Constructors4();
        Constructors4 ob2=new Constructors4("UK");
      //Constructors4 ob=new Constructors4(67000000);// couldn't be reached outside the class
        Constructors4 ob=new Constructors4(true);
    }
}
//Constructors4Test2 outside the package- has access only to "country"