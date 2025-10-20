// u05_kontrollstruktur
// auf 5.38

import java.util.Scanner;

public class HandelskammerPruefung
{
	public static void main(String [] args)
	{
		Scanner pruefungPunkt = new Scanner(System.in);

		// VariableProzent
		double prozAP1 		= 0.2;
		double prozSchrifAP2 = 0.1;
		double prozProjDok	= 0.25;
		double prozMundPrue	= 0.25;

      int[] apPunkte = new int[6];

		System.out.println();
      System.out.println("Geben Sie die Punkte für jede Frage ein.");
		System.out.println();

      System.out.print("Wie viele Punkte haben Sie in AP1 erhalten?: ");
      apPunkte [0]     = pruefungPunkt.nextInt();
		double gesamAP1     = prozAP1 * apPunkte [0];

      System.out.print("Wie viele Punkte haben Sie in AP2 schriftliche Pruefung I erhalten?: ");
      apPunkte [1]     = pruefungPunkt.nextInt();
		double gesamAP2I    = prozSchrifAP2 * apPunkte [1];

      System.out.print("Wie viele Punkte haben Sie in AP2 schriftliche Pruefung II erhalten?: ");
      apPunkte [2]     = pruefungPunkt.nextInt();
      double gesamAP2II   = prozSchrifAP2 * apPunkte [2];

      System.out.print("Wie viele Punkte haben Sie in AP2 schriftliche Pruefung III erhalten?: ");
      apPunkte [3]     = pruefungPunkt.nextInt();
      double gesamAP2III  = prozSchrifAP2 * apPunkte [3];
        
      System.out.print("Wie viele Punkte haben Sie in AP2 Projekt-Doku bekommen?: ");
      apPunkte [4]     = pruefungPunkt.nextInt();
		double gesamProjDok = prozProjDok * apPunkte [4];
        
      System.out.print("Wie viele Punkte haben Sie in AP2 Muendliche Pruefung bekommen?: ");
      apPunkte [5] = pruefungPunkt.nextInt();
		double gesamMundPrue = prozMundPrue * apPunkte [5];

      pruefungPunkt.close();

		double gesamtPunkte;
		//
		// bis hier gut
		//
		int ap2Teil [] = {gesamAP2I , gesamAP2II , gesamAP2III , gesamProjDok , gesamMundPrue};

		int wertUnter50Punkte = 0;
		// Das ist neue
		boolean bestanden = true;
		//
		
		gesamtPunkte = gesamAP1 + gesamAP2I + gesamAP2II + gesamAP2III + gesamProjDok + gesamMundPrue;

		System.out.println();
		System.out.printf("Gesamtpunkte: %.0f\n", gesamtPunkte);		
		
		if (gesamtPunkte < 50)
		{
			System.out.println("Pruefung nicht bestanden : Gesampunkte unter 50 ");
      }
		
		if (gesamtPunkte >= 50)
		{
			for (int wertAp2Teil : ap2Teil)
			{
			if (wertAp2Teil < 30)				
				{
					System.out.println("Pruefung nicht bestanden : eine AP2 Teil unter 30 ");
					break;
				}
				else if (wertAp2Teil < 50)
				{
					wertUnter50Punkte++;
				}
			}

			if(wertUnter50Punkte > 1)
			{
				System.out.println("Pruefung nicht bestanden : mehr AP2 Teil unter 50 ");
			}
			
		}
	}
}
