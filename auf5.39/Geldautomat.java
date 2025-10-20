// u05_kontrollstruktur
// auf5.39

import java.util.Scanner;

public class Geldautomat
{
	public static void main(String [] args)
	{
	   Scanner scanner = new Scanner(System.in);
      System.out.println("Wieviel wollen Sie abheben? ");
      int auszahlungsBetrag = scanner.nextInt();
      scanner.close();

		int anzahl50Scheine = 10;
		int anzahl20Scheine = 10;
		int anzahl10Scheine = 10;

		int scheine50 = 0;
		int scheine20 = 0;
		int scheine10 = 0;
		int rest 	  = auszahlungsBetrag;

		int betragScheine50 	 = rest / 50;
      rest           	    = rest - (anzahl50Scheine * 50);

      int betragScheine20   = rest / 20;
      rest                  = rest - (anzahl20Scheine * 20);

      int betragScheine10   = rest / 10;
      rest                  = rest - (anzahl10Scheine * 10);

		int restRest		    = rest;

		// Minimum Benötigt v/s Verfügbar

		if (restRest > 0)
		{
			System.out.println("Auszahlung nicht moeglich");
		}      
		else
		{
			scheine50			= Math.min(betragScheine50, anzahl50Scheine);
			if (scheine50 > 0)
			{
			System.out.println(scheine50 + " Fuenfzig-Euro-Scheine");
			}

      	scheine20			= Math.min(betragScheine20, anzahl20Scheine);
     	 	if (scheine20 > 0)
			{
			System.out.println(scheine20 + " Zwanzig-Euro-Scheine");
			}
      
      	scheine10			= Math.min(betragScheine10, anzahl10Scheine);
      	if (scheine10 > 0)
			{
			System.out.println(scheine10 + " Zehn-Euro-Scheine");
			}
		}
	}
}
