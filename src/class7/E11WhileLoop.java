package class7;

public class E11WhileLoop {
    public static void main(String[] args) {

        //1 2  4 5 7 8 1 0 11 13 14 16 17 19 20 Modulus operator
        int counter = 1;
        while (counter <= 20) {
            if (counter % 3 != 0) { //if(conter%3==0){else{Sysyem.out.print(counter+" ");}
                System.out.print(counter + " ");
            }
            counter++;
        }
    }
    }

