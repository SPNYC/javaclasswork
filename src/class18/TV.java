package class18;

public class TV {
   private int size; //you can not inherit or have  access from other class
   protected String make; //only  child has access to this, even if the child in other class or package
    String model; //access if we are in the same package

}

class SamsungTV extends TV{

    }
    class TVTester{
        public static void main(String[] args) {
            SamsungTV sm=new SamsungTV();

        }
    }

