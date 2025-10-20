// u05_kontrollstruktur
// auf5.40

import java.util.Scanner;

public class NeuerGeldautomat
{
	public static void main(String [] args)
	{
	   Scanner scanner = new Scanner(System.in);

		int anzahl50Scheine = 10;
		int anzahl20Scheine = 10;
		int anzahl10Scheine = 10;

      int gesamtbestand = (anzahl50Scheine * 50) + (anzahl20Scheine * 20) + (anzahl10Scheine * 10);

		while (gesamtbestand > 0)
		{
      	System.out.println("Wieviel wollen Sie abheben? ");
      	int auszahlungsBetrag = scanner.nextInt();

			int scheine50 = 0;
			int scheine20 = 0;
			int scheine10 = 0;
			int rest 	  = auszahlungsBetrag;

			if (auszahlungsBetrag > gesamtbestand)
			{
				System.out.println("Fehler: Der angeforderte Betrag (" + auszahlungsBetrag + " Euro) uebersteigt den Gesamtbestand im Automaten");
				break;
			}

			int betragScheine50 	 = rest / 50;
			scheine50			    = Math.min(betragScheine50, anzahl50Scheine);
			rest					 = rest - (scheine50 * 50);

   	   int betragScheine20   = rest / 20;
   	   scheine20			    = Math.min(betragScheine20, anzahl20Scheine);
			rest					 = rest - (scheine20 * 20);

   	   int betragScheine10   = rest / 10;
   	   scheine10			    = Math.min(betragScheine10, anzahl10Scheine);
			rest					 = rest - (scheine10 * 10);

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

				anzahl50Scheine = anzahl50Scheine - scheine50;
            anzahl20Scheine = anzahl20Scheine - scheine20;
            anzahl10Scheine = anzahl10Scheine - scheine10;

				gesamtbestand = gesamtbestand - auszahlungsBetrag;
				}
			}
			
			if (gesamtbestand == 0)
			{
				System.out.println();
				System.out.println("Geldautomat leer!");
			}
		}
	}
}
