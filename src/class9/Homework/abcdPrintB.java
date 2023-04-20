package class9.Homework;

public class abcdPrintB {
    public static void main(String[] args) {
//Create an array of chars and store grades into it:A,B,C,D.Then print a grade B (2 different ways)
        char [] grade={'A','B','C','D'};
        System.out.println("grade "+grade[1]);

        System.out.println();
        char [] grade1=new char[4];

        grade1[0]='A';
        grade1[1]='B';
        grade1[2]='C';
        grade1[3]='D';

        System.out.println("grade "+grade1[1]);


    }
}
