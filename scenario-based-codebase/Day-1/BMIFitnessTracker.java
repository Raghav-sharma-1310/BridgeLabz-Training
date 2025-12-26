/* Problem 2: Maya’s BMI Fitness Tracker
Maya is a fitness coach who wants to calculate BMI using the formula BMI = weight / (height * height), and checks the BMI category as Underweight, Normal, or Overweight using if-else conditions for their clients*/

import java.util.*;

public class BMIFitnessTracker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight (in kg): ");
        double weightInKg = input.nextDouble();

        System.out.print("Enter your height (in meters): ");
        double heightInMeters = input.nextDouble();

        // Calculating BMI using the formula
        double bmi = weightInKg / (heightInMeters * heightInMeters);

        // Display calculated BMI
        System.out.println("Your BMI is: " + bmi);

        // Checking BMI category using if-else conditions
        if (bmi < 18.5) {
            System.out.println("BMI Category: Underweight");
        } 
        else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("BMI Category: Normal");
        } 
        else {
            System.out.println("BMI Category: Overweight");
        }

        input.close();
    }
}
