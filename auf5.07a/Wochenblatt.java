// u05_kontrollstruktur
// auf5.07a

public class Wochenblatt
{
   public static void main(String[] args)
   {
      System.out.println("");
      System.out.println("Zustellung Wochenblatt");

      for(int faktor = 5; faktor <= 7; faktor++)
      {
         System.out.printf("Ich betrete Nr %d\n",faktor);
         System.out.printf("");

         for(int i = 0; i <= 3; i++)
         {
            System.out.printf("Zugestellt in Nr %d, %d.Stock\n",faktor,i);
         }
         
      }
   }
}
