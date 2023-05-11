package class16;

public class SumOfArray {
    /*
    Create a method that will accept an array as parameters and
    will return a sum of all elements from that array. Method should
    be visibly only within same package and accessible by the
    creating an instance/object of the class
     */

    int sumArray(int [] array){
        int summ=0;
        for (int i = 0; i < array.length; i++) {
            summ=summ+array[i]; // for(int num:array){ summ=summ+num}
        }
        return summ;
    }

    public static void main(String[] args) {
        SumOfArray arr=new SumOfArray();
        int result=arr.sumArray(new int [] {10,10,10});
        System.out.println(result);
    }
}
