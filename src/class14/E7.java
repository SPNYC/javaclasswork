package class14;

public class E7 {
    //create a method that will take 2 parameters as a number
    //and prints which number is larger

    void isLarger (int num1, int num2) {
        if (num1>num2) {
            System.out.println(num1);
        }
        else {
            System.out.println(num2);
            //System.out.print(Math.max(num1,num2));
        }
    }

    public static void main(String[] args) {
        E7 obj = new E7();
        obj.isLarger(10,30);
    }
}
