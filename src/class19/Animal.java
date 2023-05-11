package class19;

public class Animal {
   //create 3 class like Dog Cat Horse, define 5 properties in each class
    //and one printInfo method that will print the value of these variables
    //create constructors as well in each child class tp initialize those
    //properties create one object of each class and call the printIfo method

        String name;
        String breed;
        int age;
        String color;
        double weight;

        public Animal(String name, String breed, int age, String color, double weight) {
            this.name = name;
            this.breed = breed;
            this.age = age;
            this.color = color;
            this.weight = weight;
        }

        void printInfo() {
            System.out.println(name + " " + breed + " " + age + "  " + " " + color + " " + weight);

        }
        }

        class Dog extends Animal {
double price;
            public Dog(String name, String breed, int age, String color, double weight, double price) {
                super(name, breed, age, color, weight);
                this.price=price; //assigning the price
            }
            void printInfo(){  //create a method with exact name as parent has
                super.printInfo(); //call from parent, reusing print info method from parent class by using super key word
                System.out.println(price); //print additional
            }
        }

        class Horse extends Animal {
            public Horse(String name, String breed, int age, String color, double weight) {
                super(name, breed, age, color, weight);
            }
        }


        class Cat extends Animal {


            public Cat(String name, String breed, int age, String color, double weight) {
                super(name, breed, age, color, weight);
            }
        }

        class AnimalTester {
            public static void main(String[] args) {

                Dog dog = new Dog("Tom", "poodle", 5, "white", 10.5, 200);
                dog.printInfo();
            }
        }




