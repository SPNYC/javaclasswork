package class9;

public class E9Arrays {
    public static void main(String[] args) {

        boolean [] flags={true,false,true,false,false,true};
        int counter=0;
        /*
        write a loop to count how mwny values in above array are false
         */
        for (int i = 0; i < flags.length; i++) {
            if (!flags[i]) {
                counter++;
            }
            }
            System.out.println(counter);
        }
    }

