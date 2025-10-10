// u05_Kontrollstruktur
// auf5.26

import java.io.*;

public class Zahlungsplan3
{
   public static void main(String [] args) throws Exception
   {
      InputStreamReader eingabeLeser;
      BufferedReader    gepufferterLeser;
      String            eingabeRaten;        //rate eingabe
      String            eingabeKreditbetrag; //kreditebetrag eingabe

      eingabeLeser     = new InputStreamReader(System.in);
      gepufferterLeser = new BufferedReader(eingabeLeser);

      System.out.println("Bitte eine Kreditbetrag eingeben:");
      eingabeKreditbetrag = gepufferterLeser.readLine();

      System.out.println("Bitte eine Rate eingeben:");
      eingabeRaten = gepufferterLeser.readLine();

      int kreditbetrag = Integer.parseInt(eingabeKreditbetrag);
      int rate = Integer.parseInt(eingabeRaten);

      int rest;
      int betragraten;

      System.out.println("Zahlungsplan3");
      System.out.println("=============");

      betragraten = kreditbetrag / rate;
      rest = kreditbetrag - betragraten*rate;

      for(int i = 1; i <= betragraten; i++)
      {
         System.out.println(i + ". " + rate + " Euro");
      }      
      if(rest>0)
      {
         System.out.println((betragraten+1) + ". Rate: " + rest + " Euro");
      }
   }
}
