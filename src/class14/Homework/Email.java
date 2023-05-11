package class14.Homework;

public class Email {
    /*
    Create a method createEmail(). Based on values of users firstName, lastName and email type,
     your method should return complete email Address.
    Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
     */


  void createEmail (String firstname, String lastName, String email){
       System.out.println(firstname.toLowerCase()+lastName.toLowerCase()+email);
   }

    public static void main(String[] args) {
        Email em=new Email();
        em.createEmail("John", "Snow","@gmail.com");

    }
}

