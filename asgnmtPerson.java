package january17_oopsconcepts;
public class asgnmtPerson

{

   // fields

   public String name;

   public String email;

   private String phoneNumber;


   // constructor

   public asgnmtPerson(String theName)

   {

      this.name = theName;

   }


   // methods - getters

   public String getName() { return this.name;}

   public String getEmail() { return this.email;}

   public String getPhoneNumber() { return this.phoneNumber;}


   // methods - setters

   public void setName(String theName) { this.name = theName;}

   public void setEmail(String theEmail) {this.email = theEmail;}

   public void setPhoneNumber(String thePhoneNumber) { this.phoneNumber = thePhoneNumber;}

   public String toString()

   {

      return this.name;

   }


   // main method for testing

   public static void main(String[] args)

   {

      asgnmtPerson p1 = new asgnmtPerson("Imran");

      System.out.println(p1);
      p1.setEmail("mohdim@gmail.com");
      System.out.println(p1.getEmail());
      
      p1.setName("ironman");
      System.out.println(p1.getName());

      asgnmtPerson p2 = new asgnmtPerson("Jean");

      p2.setEmail("jean@gmail.com");
      System.out.println(p2.getEmail());

      p2.setPhoneNumber("404 899-9955");
      System.out.println(p2.getPhoneNumber());

      System.out.println(p2);

   }

}
