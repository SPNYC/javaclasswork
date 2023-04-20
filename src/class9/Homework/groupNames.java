package class9.Homework;

public class groupNames {
    public static void main(String[] args) {
        //create an array of names and store allnames of your group.Then print your name from that array (2 different ways)
        String [] names={"Nataliya","Svetlana","Semir","Slobodan","Tiadorh","Timur","Wael","Yelizaveta","Zarina"};
        System.out.println(names[1]);

        System.out.println();

        String[] names1=new String[9];
        names1[0]="Nataliya";
        names1[1]="Svetlana";
        names1[2]="Semir";
        names1[3]="Slobodan";
        names1[4]="Tiadorh";
        names1[5]="Timur";
        names1[6]="Wael";
        names1[7]="Yelizaveta";
        names1[8]="Zarina";

        System.out.println(names1[1]);
    }
}
