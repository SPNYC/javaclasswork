package class15.Homework;

public class Students {
    /*
Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students.
     */
  String name;
  String id;
  int numberOfStudents;

    public static void main(String[] args) {
      int  numberOfStudents=0;
        Students stud1=new Students();
        stud1.name="Zarina";
        stud1.id="ST5774682764";
        numberOfStudents++;

        Students stud2=new Students();
        stud2.name="Naralia";
        stud2.id="ST87543489579";
        numberOfStudents++;

        Students stud3=new Students();
        stud3.name="Yelizaveta";
        stud3.id="ST334535456";
        numberOfStudents++;

        Students stud4=new Students();
        stud4.name="Kiran";
        stud4.id="ST35635475465";
        numberOfStudents++;

        System.out.println("Total Students number of the class "+numberOfStudents);

    }

}
