package class20.Homework;

public class CreditCard {
    /*
    Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
     */
    double balance=20000.0;
  double interest=4.5;

    void CalculateInterest(){
        System.out.println("Interest rate is "+(balance*interest)/100);

    }
  static  class Visa extends CreditCard{

    }
   static class AX extends CreditCard{
       double balance=10000.0;
       double interest=5.0;
        @Override
       void  CalculateInterest(){
            System.out.println("Interest rate is "+(balance*interest)/100);
        }
    }

    public static void main(String[] args) {

        CreditCard ccard=new CreditCard();
        ccard.CalculateInterest();

        Visa visa=new Visa();
        visa.CalculateInterest();

        AX ax=new AX();
        ax.CalculateInterest();

    }
}
