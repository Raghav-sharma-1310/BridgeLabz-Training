import java.util.*;
 
public class BMIOfTeam{
   
   // Method to calculate BMI for all persons
   public static void calculateBMI(double[][] personData) {
        for (int i = 0; i < personData.length; i++) {

            double weight = personData[i][0];     
            double heightCm = personData[i][1];     
            double heightMeter = heightCm / 100;    

            double bmi = weight / (heightMeter * heightMeter);
            personData[i][2] = bmi;                
        }
   }

   // Method to determine BMI status
   public static String[] determineBMIStatus(double[][] personData) {
        String[] status = new String[personData.length];

        for (int i = 0; i < personData.length; i++) {
            double bmi = personData[i][2];

            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } 
            else if (bmi <= 24.9) {
                status[i] = "Normal";
            } 
            else if (bmi <= 39.9) {
                status[i] = "Overweight";
            } 
            else {
                status[i] = "Obese";
            }
        }
        return status;
   }

   public static void main(String args[]){
       Scanner input = new Scanner(System.in);
       int rows = 10;
       int columns =3;
       
       double[][] personData = new double[rows][columns];

       // Taking weight and height as user input       
       for(int i=0; i<rows; i++){
           System.out.println("Enter the details of persons : " +(i+1));
           while(true){
                System.out.print("Enter weight (kg): ");
                personData[i][0] = input.nextDouble();

                if (personData[i][0] > 0) {
                    break;
                } 
                else {
                    System.out.println("Invalid weight");
                }  
           }
           while(true){
                System.out.print("Enter height (cm): ");
                personData[i][1] = input.nextDouble();

                if (personData[i][1] > 0) {
                    break;
                } 
                else {
                    System.out.println("Invalid height");
                }
           }
       }
       // Calculate BMI
       calculateBMI(personData);

       // Get BMI status
       String[] bmiStatus = determineBMIStatus(personData);
       
       // Display the results
        for (int i = 0; i < rows; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("Height: " + personData[i][1] + " meters");
            System.out.printf("BMI: %.2f\n", personData[i][2]);
            System.out.println("Status: " + bmiStatus[i]);
        }     
   }
}