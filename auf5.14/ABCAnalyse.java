// u05_kontrollstruktur
// auf5.14

public class ABCAnalyse
{
   public static void main(String [] args)
   {
      char prioritaet = 'A';
      
      if(prioritaet == 'A')
      {
         System.out.println("hoch");
      }
      else
      {
         if(prioritaet == 'B')
         {
            System.out.println("mittel");
         }
         else
         {
            if(prioritaet == 'C')
            {
               System.out.println("niedrig");
            }
            else
            {
               System.out.println("unzulaessig Wert"); 
            }
         }
      }
   }
}
