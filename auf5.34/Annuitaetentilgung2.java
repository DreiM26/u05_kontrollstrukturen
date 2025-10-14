// u05_kontrollstruktur
// auf5.34

import java.io.*;

public class Annuitaetentilgung2
{
	public static void main(String [] args) throws Exception
	{
	   InputStreamReader eingabeLeser;
      BufferedReader    gepufferterLeser;	

		// String Variable
		String            eingRestschuld;
      String            eingZinssatz;
      String            eingAnnuitaet;

		int jahr = 1;

      eingabeLeser      = new InputStreamReader(System.in);
      gepufferterLeser  = new BufferedReader(eingabeLeser);

		System.out.println("Bitte eine Kredithöhe eingeben:");
      eingRestschuld    = gepufferterLeser.readLine();

      System.out.println("Bitte eine Zinssatz eingeben:");
      eingZinssatz      = gepufferterLeser.readLine();

      System.out.println("Bitte eine Annuitaet eingeben:");
      eingAnnuitaet     = gepufferterLeser.readLine();

		// Int Variablen

		int restschuld		= Integer.parseInt(eingRestschuld);
		int zinssatz		= Integer.parseInt(eingZinssatz);
		int annuitaet		= Integer.parseInt(eingAnnuitaet);

      System.out.println("");
      System.out.println("Annuitaetentilgung");
      System.out.println("");

		while (restschuld > 0)
		{
      	int tilgungsbetrag;
         int zinsen;
     	   int zinsenPorzent;

			zinsen			= restschuld * zinssatz;
			zinsenPorzent  = zinsen/100;
			// restschuld     = restschuld - zinsenPorzent;
			tilgungsbetrag = annuitaet - zinsenPorzent;

			if(tilgungsbetrag > restschuld)
			{
				tilgungsbetrag = restschuld;
				annuitaet = restschuld + zinsenPorzent;
			}
     
         System.out.println("Jahr " + (jahr) + "  Restschuld " + restschuld + "  Zinsen " + zinsenPorzent + "  Tilgung " + tilgungsbetrag + "  Zahlung " + annuitaet);

				restschuld = restschuld - tilgungsbetrag;
				jahr++;
		}
	}
}
