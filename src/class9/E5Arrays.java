package class9;

public class E5Arrays {
    public static void main(String[] args) {

        /*
        create an array of Strings store 5 names in that array
        print all of the names from that array with the help of a for loop
        try printing with the help of a while loop as well
         */
   String [] names={"Jack","Peter","john","David","Matthew"};
   for(int j=0; j < names.length; j++){
            System.out.print(names[j]+" ");
        }
        System.out.println();
        System.out.println("---------------------------------");

   int counter=0;
   while(counter<names.length){
       System.out.print(names[counter]+" ");
       counter++;
   }


    }
}
