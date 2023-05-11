package class15;

public class SyntaxEmployee{

    /*
    Create a Class called SyntaxEmployee:
Create three  variables  empID , salary and set the CEO to “Sumair”
Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects
     */

        static String CEO = "Sumair";
        int empID;
        double salary;

    public static void main(String[] args) {
       SyntaxEmployee emp= new SyntaxEmployee();
       emp.empID=123;
       emp.salary=123449;

        System.out.println(SyntaxEmployee.CEO);//99.99 this is how they are used

        SyntaxEmployee emp1=new SyntaxEmployee();
        emp1.empID=456;
        emp1.salary=87654;
        System.out.println(SyntaxEmployee.CEO);
        System.out.println(emp.empID);
        System.out.println(emp1.empID);

    }
}

