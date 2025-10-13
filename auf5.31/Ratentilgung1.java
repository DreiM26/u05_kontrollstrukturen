// u05_kontrollstruktur
// auf 5.31

public class Ratentilgung1
{
   public static void main(String [] args)
   {
      int kredit   = 5000;
      int zinssatz = 6;
      int laufzeit = 5;

      int tilgungsbetrag = kredit / laufzeit;

      System.out.println("");
      System.out.println("Ratentilgung");
      System.out.println("");

      for(int i = 0; i <= (laufzeit-1); i++)
      {
         int restschuld    = kredit - (i*tilgungsbetrag);
         int zinsen        = (kredit - (i*tilgungsbetrag))*(zinssatz);
         int zinsenPorzent = zinsen/100;
          
         System.out.println("Jahr " + (i+1) + "  Restschuld " + restschuld + "  Zinsen " +  zinsenPorzent + "  Tilgung " + tilgungsbetrag + "  Zahlung " + (zinsenPorzent + tilgungsbetrag));
      }
   }
}
