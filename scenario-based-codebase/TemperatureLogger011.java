/* 11. Temperature Logger 🌡️
Record temperatures over 7 days.
● Use array and for-loop.
● Find average and max temperature.
● Use if for comparisons. Maintain readable naming and modular code blocks. */

import java.util.*;
public class TemperatureLogger011{
   public static double getAverageTemperature(double[] temperature){
      double sum = 0.0;
      for(int i=0; i<temperature.length; i++){
         sum += temperature[i];
      }
      double average = sum / 7;
      return average;
   }
   public static double getMaxTemperature(double[] temperature){
     double maxTemperature = temperature[0];
     for(int i=0; i<temperature.length; i++){
        if(maxTemperature < temperature[i]){
           maxTemperature = temperature[i];
        }
     }
     return maxTemperature;
   }
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("========= Welcome to Temperature Logger =========");
      System.out.println();
      double temperature[]= new double[7];
      for(int i=0; i<temperature.length; i++){
         System.out.print("Enter the temperature of day " + (i+1) + " in (celsius) : " );
         temperature[i] = sc.nextDouble();
      }
      System.out.println("\n=====================================================");
      System.out.println("The average of the seven days temperature : " + getAverageTemperature(temperature));
      System.out.println("The maximum temperature in seven days : " + getMaxTemperature(temperature));
      System.out.println("\n=====================================================");
      System.out.println("======== Thanks to Visiting Temperature Logger ========");
   }
}