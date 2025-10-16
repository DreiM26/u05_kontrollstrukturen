// u05_kontrollstruktur
// auf5.35

import java.util.Scanner;
import java.io.*;

public class Pfund7
{
	public static void main(String [] args) throws Exception
	{
		
	   // InputStreamReader 	eingabeLeser;
      // BufferedReader    	gepufferterLeser;	
      
		// String Variablen
		// String		euroBetrag;
		// Double		euroBetrag;
		// String		gebuehr;
		// double		wechselBetrag;
		// double		gebuehrBetrag;
		double		faktor = 0.7583;

		Scanner scanner	  = new Scanner(System.in);
      // eingabeLeser       = new InputStreamReader(System.in);
      // gepufferterLeser   = new BufferedReader(eingabeLeser);

		System.out.println("Bitte den Euro-Betrag eingeben: ");
		double euroBetrag   = scanner.nextDouble();

		System.out.println("Eingabeform: 'x_Euro' oder 'x_Prozent'");
		scanner.nextLine();
		String tarifEingabe = scanner.nextLine();

		double ergebnis = 0;

		// Eingabe in Wert und Art AUFTEILEN
		String[] teile     = tarifEingabe.split("_"); //Divide en dos lo entregado
		double   tarifWert = Double.parseDouble(teile[0]);
		String   tarifArt  = teile[1];

		if(tarifArt.equalsIgnoreCase("Euro"))
		{
			ergebnis 		 = euroBetrag + tarifWert;

			// wechselBetrag   = euroBetragZahl * faktor;

			System.out.println();
			System.out.printf("Euro-Betrag:   %10.2f Euro%n", euroBetrag);
			System.out.printf("Pfund-Betrag:  %10.2f Pfund%n", faktor * 1000);
			System.out.printf("Gebuehr    :   %10.2f Euro%n", tarifWert);
			System.out.printf("Einzuzahlen:   %10.2f Euro%n", ergebnis);
 		}
		else if(tarifArt.equalsIgnoreCase("Prozent"))
		{
			double tarfWertProz = tarifWert / 100;			
			ergebnis 		     = euroBetrag * tarfWertProz;

			// wechselBetrag       = euroBetragZahl * faktor;

			System.out.println();
			System.out.printf("Euro-Betrag:   %10.2f Euro%n", euroBetrag);
			System.out.printf("Pfund-Betrag:  %10.2f Pfund%n", faktor * 1000);
			System.out.printf("Gebuehr    :   %10.2f Euro%n", ergebnis);
			System.out.printf("Einzuzahlen:   %10.2f Euro%n", (euroBetrag+ergebnis));

		}
		else
		{
			System.out.println("Ungültige Eingabe für den Tarif. Bitte verwenden Sie genauso entweder 'Euro' oder 'Prozent'."); 
		}
		scanner.close();
	}
}
