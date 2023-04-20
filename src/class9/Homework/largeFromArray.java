package class9.Homework;

public class largeFromArray {
    public static void main(String[] args) {

        int [] elements=new int[6];
        elements[0]=12;
        elements[1]=34;
        elements[2]=56;
        elements[3]=78;
        elements[4]=90;
        elements[5]=100;

        int large=0;

        for (int i = 0; i < elements.length; i++)
            if (elements[i]>large) {
                large=elements[i];
            }
        System.out.println(large);
    }
}
