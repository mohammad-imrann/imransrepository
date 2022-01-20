package january17_oopsconcepts;
public class asgnmtCoin

{


   // constant to represent heads

   private static int Tails = 1;


   // current value of the coin

   private int value = 0;


   // method to randomly set the value of the coin to heads or tails

   public void flip()

   {

      if (Math.random() < 0.5)

      {

          value = 0;

      }

      else

      {

         value = 1;

      }

   }


   // return true if the value is heads or false otherwise

   public boolean isTails()

   {

      return value == Tails;

   }


   // convert the value to a string

   public String toString()

   {

      if (value == Tails) return "Tails";

      else return "Heads";

   }


   // test the class

   public static void main(String[] args)

   {


      asgnmtCoin myCoin = new asgnmtCoin();

      for (int i = 0; i < 10; i++)

      {

         myCoin.flip();

         System.out.println(myCoin);

         System.out.println(myCoin.isTails());

      }

   }

}

