package class14;

public class E5ArrayUtils {
    /*
    create a method call it contains it should take an array of int and
    int number in the method body it should search the array for  array
    that number
    if number is present in the array method should return true otherwise method
    should return false in a separate class call the method and test it
    for below input{10,20,45} number 20
     */

    boolean contains(int[] arr, int num) {
boolean isFound=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] ==num) {
                isFound=true;
                break;
            }
        }
    return isFound;
    }

        public static void main(String[] args) {
        E5ArrayUtils obj=new E5ArrayUtils();
        int [] arr={10,20,45};
        int num=20;
        boolean result=obj.contains(arr,num);
            System.out.println(result);
    }
}
