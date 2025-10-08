// u05_kontrollstruktur
// auf5.07c

public class NewYorkTimes
{
   public static void main(String [] args)
   {
      System.out.println("");
      System.out.println("Delivering The New Times");
      System.out.println("");
      
      for(int avenue = 5; avenue <= 7; avenue++)
      {
          System.out.printf("Reaching the %d avenue\n", avenue);

         for(int faktor = 21; faktor <= 25; faktor++)
         {
            if (faktor == 21 || faktor == 23 || faktor == 25)
            {

             System.out.println("");              
             System.out.printf("Enter No %d\n",faktor);
     
               for(int i = 0; i <=2; i++)
               {

                  System.out.printf("Delivered in No %d, floor %d\n", faktor, i);
                  
               }
            }
         }

         System.out.println("");

         System.out.println("----------------------------");

      }

      System.out.println("");
   }
}
