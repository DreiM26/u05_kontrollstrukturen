// u05_kontrollstruktur
// auf5.30

import java.io.*;

public class BreakEvenPoint3
{
   public static void main(String [] args) throws Exception
   {
      InputStreamReader eingabeLeser;
      BufferedReader    gepufferterLeser;

      //String variablen
      String            eingVerkaufpreis;
      String            eingRohstoffkosten;
      String            eingArbeitskosten;
      String            eingFixkosten;
      String            eingMaxStueck;

      eingabeLeser     = new InputStreamReader(System.in);
      gepufferterLeser = new BufferedReader(eingabeLeser);

      System.out.println("Bitte eine Verkaufspreis pro Stueck eingeben:");
      eingVerkaufpreis = gepufferterLeser.readLine();

      System.out.println("Bitte eine Rohstoffkosten pro Stueck eingeben:");
      eingRohstoffkosten= gepufferterLeser.readLine();

      System.out.println("Bitte eine Arbeitskosten pro Stueck eingeben:");
      eingArbeitskosten = gepufferterLeser.readLine();

      System.out.println("Bitte eine Fixkosten pro Stueck eingeben:");
      eingFixkosten = gepufferterLeser.readLine();

      System.out.println("Bitte eine Maximale Stueckzahl pro Stueck eingeben:");
      eingMaxStueck = gepufferterLeser.readLine();

      //Int variablen

      int verkaufspreis  = Integer.parseInt(eingVerkaufpreis);
      int rohstoffkosten = Integer.parseInt(eingRohstoffkosten);
      int arbeitskosten  = Integer.parseInt(eingArbeitskosten);
      int fixkosten      = Integer.parseInt(eingFixkosten);
      int maxstueckzahl  = Integer.parseInt(eingMaxStueck);
      int breakEvenPoint = 0;

      //System.out.prinln
      
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

            if(stueckUeberschuss <= 0)
            {
                breakEvenPoint = i;
            }
        }

      System.out.println("");
      System.out.println("Es müssen mindestens " + (breakEvenPoint) + " Stück produziert werden");


      

   }
}
