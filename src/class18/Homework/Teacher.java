package class18.Homework;

public class Teacher {
    /*
    Write a Java program called Teacher.  Identify features and 4 behaviour of that Class.
    Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher . Test all 4 classes
     */
    String name;
    int yearsOfTeaching;
    int salary;
    String subject;

void printInfo(){
    System.out.println("Techer's name is "+name+", years of teching -  "+yearsOfTeaching+", salary - "+salary+ ", subject- "+subject);
}
void school(){
    System.out.println("Work at school");
}
void bonus(){
    System.out.println("Have a bonus in the end of school year");
}
void students(){
    System.out.println("Students like their teacher");
}

    public static void main(String[] args) {
        MathTeacher mteacher=new MathTeacher();
        mteacher.name="Mrs Smith";
        mteacher.yearsOfTeaching=5;
        mteacher.salary=120000;
        mteacher.subject="Math";
        System.out.println();
        mteacher.printInfo();
        mteacher.school();
        mteacher.bonus();
        mteacher.students();
        mteacher.numbers();
        System.out.println();

        ChemistryTeacher chteacher=new ChemistryTeacher();
        chteacher.name="Mrs. Salvadore";
        chteacher.yearsOfTeaching=10;
        chteacher.salary=110000;
        chteacher.subject="Chemistry";
        chteacher.printInfo();
        chteacher.school();
        chteacher.bonus();
        chteacher.students();
        chteacher.elements();
        System.out.println();

        PianoTeacher pteacher=new PianoTeacher();
        pteacher.name="Mr.More";
        pteacher.yearsOfTeaching=3;
        pteacher.salary=90000;
        pteacher.subject="Piano";
        pteacher.printInfo();
        pteacher.school();
        pteacher.bonus();
        pteacher.students();
        pteacher.music();
    }
}
class MathTeacher extends Teacher{
    void numbers(){
        System.out.println("Likes numbers");
    }
        }
class ChemistryTeacher extends Teacher{
    void elements(){
        System.out.println("Likes elements");
    }
}
class PianoTeacher extends Teacher{
    void music(){
        System.out.println("Likes music");
    }
}





