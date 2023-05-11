package class17.Homework;

public class Constructors4 {
    /*
    Write a java class that have 4 constructors with 4 different access levels of constructors
    (private,public,default,protected) and create 4 objects of this class:
    1 - inside same class; 2 - from outside the class; 3 - from different class inside different package  and observe result.
     */

    String country;
    int population;
    boolean hasCapital;

 Constructors4(){
     System.out.println("Default constructor- no parameters");
 }
 public Constructors4(String country){
     this.country=country;
     System.out.println(this.country);
 }
private Constructors4(int population){
     this.population=population;
    System.out.println(this.population);
}
protected Constructors4(boolean hasCapital){
    this.hasCapital=hasCapital;
    System.out.println(this.hasCapital);
}
    public static void main(String[] args) {

     Constructors4 obj1=new Constructors4();
     Constructors4 obj2=new Constructors4("USA");
     Constructors4 obj3=new Constructors4(330000000);
     Constructors4 obj4=new Constructors4(true);


    }
}
