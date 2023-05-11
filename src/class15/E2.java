package class15;

public class E2 {
    // create a method, call it Method 1, print hello word in the method
    void Method1(){
        System.out.println("Hello World");
    }
// create a method that take an array as input. It adds all the numbers
    //from the array and returns the sum. name of the method should be
    //sumArr
int  sumArr( int [] arr){
    int sum=0;
    for (int i = 0; i < arr.length; i++) {
       sum=sum+arr[i] ;
    }
    return sum;
    }

    public static void main(String[] args) {
        E2 e2=new E2();
        int [] array= {10,10,10};
        int sum=e2.sumArr(array); //int result=e2.sumArr(new int[]{10,10,10});
        System.out.println(sum);
    }
}

