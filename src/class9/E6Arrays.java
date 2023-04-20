package class9;

public class E6Arrays {
    public static void main(String[] args) {
        /*
        write a loop that starts from 0 and it goes till the
        numbers 5 and print only the even numbers
         */
        int [] numbers={0,1,2,3,4,5};

        for (int i = 0; i <numbers.length ; i++) {
            if(i%2==0){
                System.out.print(numbers[i]+" ");
            }

            }
        }
    }
