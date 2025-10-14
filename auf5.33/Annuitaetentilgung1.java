// u05_kontrollstruktur
// auf5.33

public class Annuitaetentilgung1
{
	public static void main(String [] args)
	{
		int restschuld = 1735;
      int zinssatz   = 10;
		int annuitaet  = 999;
		int jahr = 1;
      // int laufzeit  = 5;

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
