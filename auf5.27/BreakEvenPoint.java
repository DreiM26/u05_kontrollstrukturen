// u05_kontrollstruktur
// auf5.27

public class BreakEvenPoint
{
   public static void main(String [] args)
   {
      int verkaufspreis  = 1500;
      int rohstoffkosten = 600;
      int arbeitskosten  = 400;
      int fixkosten      = 5000;
      int maxstueckzahl  = 15;

      int variableKosten = (rohstoffkosten + arbeitskosten); //*i=Stueckzahl
      int gesamtkosten   = fixkosten + variableKosten;       //
      int erloes         = verkaufspreis;                    //*i=Stueckzahl
      int ueberschuss    = erloes - gesamtkosten;            //

      System.out.println("Break-Even-Point");
      System.out.println("================");

      System.out.println("Verkaufspreis pro Stueck:      " + verkaufspreis);
      System.out.println("Rohstoffkosten pro Stueck:     " + rohstoffkosten);
      System.out.println("Arbeitskosten pro Stueck:      " + arbeitskosten);
      System.out.println("Fixkosten pro Monat:           " + fixkosten);
      System.out.println("Maximlae Stueckzahl pro Monat: " + maxstueckzahl);
      System.out.println("");

      for(int i = 1 ; i <= maxstueckzahl ; i++)
      {
         System.out.printf("Stueckzahl: %d  Gesamtkosten: %d   Erloes: %d   Ueberschuss: %d\n ", i, fixkosten + ((rohstoffkosten + arbeitskosten)*i) , verkaufspreis*i, verkaufspreis*i - (fixkosten + ((rohstoffkosten + arbeitskosten)*i)));
      }
   }
}
