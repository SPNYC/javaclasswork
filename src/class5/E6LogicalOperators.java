package class5;

public class E6LogicalOperators {
    public static void main(String[] args) {

       // System.out.println(true||true||false);
        int age=17;
        if(age<18 || age>60){
            System.out.println("You will get a discount");
        }
        String gender="F";   //char gender='F'
        String name="Mary";
        if (gender.equals("F") || age>60 || name!="Mary") { //(gender=='F'
            System.out.println("You will get an discount");
        }
    }
}
