//u05_kontrollstruktur
// auf5.42

import java.util.Scanner;
import java.util.StringTokenizer;

public class IPAdresse
{
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println();
		System.out.println("IP-Adresse (dezimal): ");
		String IPDezimal = scanner.nextLine();
	
							/////////////////////////////////////////////////////////
							// Wird verwendet, um den Eingabe-String (192.168.0.97)//
							// anhand des Trennzeichens (.) in einzelne            //
							// Teile ("192", "168", "0", "97") zu zerlegen.        //
                     /////////////////////////////////////////////////////////

		StringTokenizer tokenizer = new StringTokenizer(IPDezimal, ".");

		StringBuilder binaryIp = new StringBuilder();

		int octetCount = 0;

		while (tokenizer.hasMoreTokens())
		{
			String octetString  = tokenizer.nextToken();

			int octetDezimal    = Integer.parseInt(octetString);

			String octetBinary  = Integer.toBinaryString(octetDezimal);

			// Hinzufügen führender Nullen, um sicherzustellen,
			// dass das Oktett 8 Bits hat.(Korrekte binäre IP-Darstellung)
			String paddedBinary = String.format("%8s", octetBinary).replace(' ', '0'); 

			if (octetCount > 0)
			{
				binaryIp.append(".");
			}
			binaryIp.append(paddedBinary);
			octetCount++;
		}
		System.out.println();		
		System.out.println("IP-Adresse (binaer):" + binaryIp.toString());
		System.out.println();		

		scanner.close();

	}
}
