package class10.Homework;

public class nameAndGrade {
    public static void main(String[] args) {

        /*
        Create a 2D array(shorter way) in which first array will consist of 4 names
        and second array will contain grades.
        Then your program should print name of the students that has A and B grade
         */

        String [][] namesGrades={
                {"John","Jack","Jenny", "Janna"},
                {"A","B","C","D"}
        };
        System.out.print(namesGrades[0][0]+" ");
        System.out.println(namesGrades[1][0]+" ");
        System.out.print(namesGrades[0][1]+" ");
        System.out.println(namesGrades[1][1]+" ");

    }
}
