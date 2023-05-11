package class15;

public class E4 {
    String name="Jimmi";

    void print(){
        int num=10;
        System.out.println(num);
    }

    public static void main(String[] args) {
        E4 e4=new E4();
        e4.print();

        //we can re-use the same name of variables in different blocks of code

        if(true){
            int sum=0;
        }
        switch ("java"){
            case "a":
                int sum=0;
        }
        for (int i = 0; i <10 ; i++) {
            int sum=0;
            for (int j = 0; j < 5; j++) {
                System.out.println(sum);
            }

            }
        }
    }

