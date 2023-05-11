package class17.Homework;

public class Students {
    /*
    Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
    Your program should print an average mark of each students name.
     */
    String name;

    int grade1;
    int grade2;
    int grade3;


    public Students(String name, int grade1, int grade2, int grade3) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }
  double averageGrade() {
      return (grade1 + grade2 + grade3) / 3.0;
  }
    public static void main(String[] args) {
        Students st1=new Students("John",95,90,93);
        Students st2=new Students("Robert",88,86,90);
        Students st3=new Students("Janna",90,94,99);
        Students st4=new Students("Phillip",99,99,99);
        Students st5=new Students("Chloe",97,100,99);

        System.out.println(st1.name+" "+st1.averageGrade());
        System.out.println(st2.name+" "+st2.averageGrade());
        System.out.println(st3.name+" "+ st1.averageGrade());
        System.out.println(st4.name+ " "+st4.averageGrade());
        System.out.println(st5.name+" "+st5.averageGrade());
    }

    }


