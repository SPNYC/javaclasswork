package class17;

public class TwoConstructors {
    /*
    Write a java class that will have a constructor: one with parameters and second without any parameters. Create a separate Test class where
    you will execute both of the constructors 1 by 1.
     */
int num;
    TwoConstructors (){

    }
    TwoConstructors(int number){
       num=number;
    }
    void printInfo(){
        System.out.println(num);
    }

    }

