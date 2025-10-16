// u05_kontrollstruktur
// auf5.37

import java.util.Scanner;

public class Primzahl
{
	public static void main(String [] args)
	{
      Scanner oberGrenze = new Scanner(System.in);
      System.out.println("Geben Sie einen Wert ein, um zu bestimmen, wie viele Primzahlen es gibt.");
      int primZahlMax = oberGrenze.nextInt();
      oberGrenze.close();
        
      System.out.println("Primzahl bis " + primZahlMax + ":");
		        
      for (int i = 2; i <= primZahlMax; i++)
		{
			boolean primZahlRichtig = true;
            
            for (int j = 2; j <= i / 2; j++)
				{
               // Wenn der Rest der Division 0 ist, bedeutet dies, dass es einen Teiler gibt.
               if (i % j == 0)
					{
               	primZahlRichtig = false; // Es ist nicht ein Primzahl
               	break;
               }
            }
            
            if (primZahlRichtig)
				{
	            System.out.print(i + " ");
            }
       }
       System.out.println();
	}
}
