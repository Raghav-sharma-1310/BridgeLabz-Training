/*  16. Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).  */


public class DigitalWatchSimulation016{
   public static void main(String args[]){
      System.out.println("========= Digital Watch Simulation ===========\n");
      for(int hour=0; hour<24; hour++){
        if(hour == 13){
              System.out.println("=======Power Cut=======");
              break;
        }
        for(int minute=0; minute<60; minute++){
           System.out.println("Time -> " + hour + " : " + minute); 
        }
      }
      System.out.println(" \n========= Closing Watch Simulation ===========");
   }
}