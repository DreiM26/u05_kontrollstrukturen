// u05_kontrollstruktur
// auf5.28

public class BreakEvenPoint2
{
   public static void main(String [] args)
   {
      int verkaufspreis  = 1500;
      int rohstoffkosten = 600;
      int arbeitskosten  = 400;
      int fixkosten      = 5000;
      int maxstueckzahl  = 15;
      int breakEvenPoint = 0;

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
        int variableKosten = (rohstoffkosten + arbeitskosten) * i;
        int gesamtkosten   = fixkosten + variableKosten;
        int erloes         = verkaufspreis * i;
        int ueberschuss    = erloes - gesamtkosten;
        int stueckkosten   = gesamtkosten / i;
        int stueckUeberschuss = ueberschuss / i;

            System.out.printf("Stueckzahl: %d  Stueckkosten: %d   Ueberschuss pro Stueck: %d\n", i, stueckkosten, stueckUeberschuss);

            if(stueckUeberschuss == 0)
            {
                breakEvenPoint = i;
            }
        }

      System.out.println("");
      System.out.println("Es müssen mindestens " + breakEvenPoint + " Stück produziert werden");
   }
}
