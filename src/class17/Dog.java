package class17;

public class Dog {
   private String name;
   private String color;
   private String breed;
   private int age;

    Dog(String dogName,String dogColor,String dogBreed,int dogAge){
        name=dogName;
        color=dogColor;
        breed=dogBreed;
        age=dogAge;
    }
    void printInfo(){
        System.out.println(name+" "+color+" "+breed+" "+age);
    }
    //create 5 objects of this dog class provide initial values and for each
    //object call the printInfo method

    public static void main(String[] args) {
        /*Dog d=new Dog();
        d.name="Jack";
        d.color="Black";
        d.breed="Buldog";
        d.age=5;

        Dog d1= Dog();
        d1.name="Jessie";
        d1.color="Grey";
        d1.breed="Husky";
        d1.age=7;

        Dog d2= Dog();
        d2.name="Jonny";
        d2.color="Ginger";
        d2.breed="Chihuahua";
        d2.age=3;

        Dog d3= Dog();
        d3.name="Jina";
        d3.color="Brown";
        d3.breed="No";
        d3.age=15;

        Dog d4= Dog();
        d4.name="Jacob";
        d4.color="White";
        d4.breed="Shinu";
        d4.age=10;


        d.printInfo();
        d1.printInfo();
        d2.printInfo();
        d3.printInfo();
        d4.printInfo(); */
        Dog dog1=new Dog("Jack","black","husky",12);
        Dog dog2=new Dog("Jonny","Grey","Chihuahua",2);
dog1.printInfo();
dog2.printInfo();
    }
}
