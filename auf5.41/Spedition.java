// u05_kontrollstruktur
// auf5.41

import java.util.Scanner;

public class Spedition
{
	public static void main(String [] args)
   {
	   Scanner scanner =  new Scanner(System.in);		

      int w1MaxLadegewichtInitial = 10;
      int w2MaxLadegewichtInitial = 10;
      int w1MaxLadevolumenInitial = 20;
      int w2MaxLadevolumenInitial = 20;

      // Ladegewicht
      // Aktuelles
      int w1AktLadegewicht = 0;
      int w2AktLadegewicht = 0;

      // Ladevolumen
      // Aktuelles
      int w1AktLadevolumen = 0;
      int w2AktLadevolumen = 0;
        
      System.out.printf("Wagen 1: Maximales Ladegewicht %-5s, Maximales Ladevolumen %s\n", w1MaxLadegewichtInitial, w1MaxLadevolumenInitial);
      System.out.printf("       : Aktuelles Ladegewicht %-5s, Aktuelles Ladevolumen %s\n", w1AktLadegewicht, w1AktLadevolumen);
      System.out.println();
      System.out.printf("Wagen 2: Maximales Ladegewicht %-5s, Maximales Ladevolumen %s\n", w2MaxLadegewichtInitial, w2MaxLadevolumenInitial);
      System.out.printf("       : Aktuelles Ladegewicht %-5s, Aktuelles Ladevolumen %s\n", w2AktLadegewicht, w2AktLadevolumen);

      while ( (w1AktLadegewicht < w1MaxLadegewichtInitial || w1AktLadevolumen < w1MaxLadevolumenInitial) 
          || (w2AktLadegewicht < w2MaxLadegewichtInitial || w2AktLadevolumen < w2MaxLadevolumenInitial) )
      { 
			//WAGEN 1      	
			if (w1AktLadegewicht < w1MaxLadegewichtInitial && w1AktLadevolumen < w1MaxLadevolumenInitial)
      	{		
				System.out.println();         	
				System.out.print("Gewicht der naechsten Ladung: ");
            int naechstenGewLadung1 = scanner.nextInt();
            System.out.print("Volumen der naechsten Ladung: ");	
            int naechstenVolLadung1 = scanner.nextInt();

            if (w1AktLadegewicht + naechstenGewLadung1 <= w1MaxLadegewichtInitial && w1AktLadevolumen + naechstenVolLadung1 <= w1MaxLadevolumenInitial)
            {
               w1AktLadegewicht = w1AktLadegewicht + naechstenGewLadung1;
               w1AktLadevolumen = w1AktLadevolumen + naechstenVolLadung1;

               System.out.printf("Wagen 1: Aktuelles Ladegewicht %-5s, Aktuelles Ladevolumen %s\n", w1AktLadegewicht, w1AktLadevolumen);
            }
            else
            {
               System.out.println("Verladung nicht moeglich");
            }
         }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			boolean w1Voll = (w1AktLadegewicht >= w1MaxLadegewichtInitial || w1AktLadevolumen >= w1MaxLadevolumenInitial);
		   if (w1Voll)	
		   {
		      System.out.println("Wagen 1 ist voll");
		   }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
         // WAGEN 2
         if (w2AktLadegewicht < w2MaxLadegewichtInitial && w2AktLadevolumen < w2MaxLadevolumenInitial)
         {
				System.out.println();              	
				System.out.print("Gewicht der naechsten Ladung: ");
            int naechstenGewLadung2 = scanner.nextInt();
            System.out.print("Volumen der naechsten Ladung: ");	
            int naechstenVolLadung2 = scanner.nextInt();
                
            if (w2AktLadegewicht + naechstenGewLadung2 <= w2MaxLadegewichtInitial && w2AktLadevolumen + naechstenVolLadung2 <= w2MaxLadevolumenInitial)
            {
            	w2AktLadegewicht = w2AktLadegewicht + naechstenGewLadung2;
               w2AktLadevolumen = w2AktLadevolumen + naechstenVolLadung2;

               System.out.printf("Wagen 2: Aktuelles Ladegewicht %-5s, Aktuelles Ladevolumen %s\n", w2AktLadegewicht, w2AktLadevolumen);
            }
            else
            {
            	System.out.println("Verladung nicht moeglich");
            }
         }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		   boolean w2Voll = (w2AktLadegewicht >= w2MaxLadegewichtInitial || w2AktLadevolumen >= w2MaxLadevolumenInitial);
		   if (w2Voll)	
		   {
		      System.out.println("Wagen 2 ist voll");
		   }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		   if (w1Voll && w2Voll)
		   {
				System.out.println();		   	
				System.out.println("Beide Wagen sind voll.");
				break;
		   }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		}
		scanner.close(); 
    }
}
