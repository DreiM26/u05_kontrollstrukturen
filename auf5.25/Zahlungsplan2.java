// u05_Kontrollstruktur
// auf5.25

public class Zahlungsplan2
{
   public static void main(String [] args)
   {
      int kreditbetrag = 600;
      int betragraten;
      int rest;

      System.out.println("Zahlungsplan2");
      System.out.println("=============");

      betragraten = kreditbetrag / 100;
      rest = kreditbetrag - betragraten*100;

      for(int i = 1; i <= betragraten; i++)
      {
         System.out.println(i + ". Rate: 100 Euro");
      }      
      if(rest>0)
      {
         System.out.println((betragraten+1) + ". Rate: " + rest + " Euro");
      }
   }
}
