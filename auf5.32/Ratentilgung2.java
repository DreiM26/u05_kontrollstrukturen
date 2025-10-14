// u05_kontrollstruktur
// auf 5.32

import java.io.*;

public class Ratentilgung2
{
   public static void main(String [] args) throws Exception
   {
      InputStreamReader eingabeLeser;
      BufferedReader    gepufferterLeser;

      // String Variablen
		String            eingKredit;
      String            eingZinssatz;
      String            eingLaufzeit;

      eingabeLeser     = new InputStreamReader(System.in);
      gepufferterLeser = new BufferedReader(eingabeLeser);

		System.out.println("Bitte eine Kredithöhe eingeben:");
      eingKredit       = gepufferterLeser.readLine();

      System.out.println("Bitte eine Zinssatz eingeben:");
      eingZinssatz     = gepufferterLeser.readLine();

      System.out.println("Bitte eine Laufzeit eingeben:");
      eingLaufzeit     = gepufferterLeser.readLine();

		//Int Variablen

      int kredit    = Integer.parseInt(eingKredit);
      int zinssatz  = Integer.parseInt(eingZinssatz);
      int laufzeit  = Integer.parseInt(eingLaufzeit);

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
