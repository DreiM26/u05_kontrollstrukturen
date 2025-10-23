// u05_kontrollstruktur
// auf5.43

import java.util.Scanner;

public class PrimFaktorenZerleger
{
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Zu zerlegende Zahl: ");
		int n = scanner.nextInt();

		StringBuilder ergebnis = new StringBuilder(n + " = ");

      boolean ersterFaktor = true;

		for (int i = 2; i <= n; i++)
		{
      	while (n % i == 0)
			{
         	if (!ersterFaktor)
				{
            	ergebnis.append(" * ");
            }
                
				ergebnis.append(i);
            ersterFaktor = false;

            n /= i;
         }
         
         if (n == 1)
			{
	         break;
         }
		}
		
		System.out.println(ergebnis.toString());
	}
}
