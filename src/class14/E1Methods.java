package class14;

public class E1Methods {


    /*
    void=> return type of the method void means this
    does not return any data other examples of return types
    can be String int boolean char Dog etc.
    prinWord=> is the name of the method
    (String word)=>parameters/input
    {System.out.println(word);} - body of the method, if else conditions loops etc.


     */
    void printWord(String word){
        System.out.println(word);
    }


    public static void main(String[] args) {
/*
we are creating an object of the E1Method class
in java all the classes can be treated as data type
new E1Methods();=>creating the object of the E1Methods class
 */
        E1Methods obj=new E1Methods();
        //we are calling the printWord() method on obj object and passing
        //"java" as argument or input
        obj.printWord("Java");
    }
}

