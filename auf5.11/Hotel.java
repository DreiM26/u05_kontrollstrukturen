// u05_kontrollstruktur
// auf5.11

public class Hotel
{
   public static void main(String [] args)
   {
   
   int sterne = 3;
   
   System.out.println("        /\\        ");
   System.out.println("       /  \\       ");
   System.out.println("      /    \\      ");
   System.out.println("     /      \\     ");
   System.out.println("    /        \\    ");
   System.out.println("   /   (  )   \\   ");
   System.out.println("  /            \\  ");
   System.out.println(" /______________\\ ");
   System.out.println("/|              |\\");
   System.out.println(" |  ___    ___  |  ");
   System.out.println(" |  | |    | |  |  ");
   System.out.println(" |  ---    ---  |  ");

   if(sterne == 1)
   {
   System.out.println(" |  Absteige___ |  ");
   }
   
   if(sterne == 2)
   {
   System.out.println(" |  Gasthaus___ |  ");
   }

   if(sterne == 3)
   {
   System.out.println(" |  Hotel   ___ |  ");
   }

   if(sterne == 4)
   {
   System.out.println(" |  Palast  ___ |  ");
   }

   System.out.println(" |  |   |   | | |  ");
   System.out.println(" |  |   |   --- |  ");
   System.out.println("===================");
   }
}
