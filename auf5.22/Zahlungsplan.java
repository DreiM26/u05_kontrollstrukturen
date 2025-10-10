// u05_Kontrollstruktur
// auf5.22

public class Zahlungsplan
{
   public static void main(String [] args)
   {
   
   int raten = 6;
   int kreditbetrag = 620;
   int betragraten;

   System.out.println("Zahlungsplan");
   System.out.println("============");

   for(int i = 1; i <= raten; i++)
   {
      betragraten = kreditbetrag / raten;

      System.out.println(i + ". Rate: " + betragraten + " Euro");
   }

   }
}
