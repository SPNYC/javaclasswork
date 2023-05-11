package class20;
/*
Create 3 animal classes(Dog,Cat,Horse) create 5 methods in each class. create
3 fields and constructors as well in each class. Create the object of all 3 classes
and call 2 methods from each class. Yuo must use inheritance to avoid code duplication
 */
public class Animal3 {
    String name;
    String breed;
    int age;


    public Animal3(String name, String breed, int age) {

        this.name = name;
        this.breed = breed;
        this.age = age;

    }

    void sleep() {
        System.out.println("zzzzzzzzzz");
    }

    void eat() {
        System.out.println("nyam-nyam");
    }

    void speak() {
        System.out.println("speakingngngn");
    }
}
class Dog extends Animal3 {


    public Dog(String name, String breed, int age) {
        super(name, breed, age);
    }
    @Override
    void sleep(){
        System.out.println("I like to sleep about 10.6 hours a day");
    }
}
    class Cat extends Animal3{


        public Cat(String name, String breed, int age) {
            super(name, breed, age);
        }
    }
    class Horse extends Animal3{

        public Horse(String name, String breed, int age) {
            super(name, breed, age);
        }


}

