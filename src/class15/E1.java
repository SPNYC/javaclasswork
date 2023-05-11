package class15;

public class E1 {
    //create a method that takes a number as input and creates an array of int
    //of that size. fill the array with some numbers lets
    //say 10 call the method createArray

    int [] createArray(int  size){
        int [] arr=new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=10;
        }
        return arr;
    }

    public static void main(String[] args) {

        E1 e1=new E1();
        int[] array = e1.createArray(5);
        //System.out.println(Arrays.toString(array)); - 1 version
      /*  for (int i:array){                          - 2 version
            System.out.println(i);
        }

       */
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");          // - 3 version
        }
    }
}

