import java.util.*;
// Create a class with name BMICalculation2D
public class BMICalculation2D {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input for number of persons
        System.out.print("Enter number of persons: ");
        int number = input.nextInt();

        // 2D array to store weight, height, BMI
        double[][] personData = new double[number][3];

        String[] weightStatus = new String[number];

        // Take input for weight and height with validation
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            // Weight input
            while (true) {
                System.out.print("Enter weight (kg): ");
                personData[i][0] = input.nextDouble();

                if (personData[i][0] > 0) {
                    break;
                } 
                else {
                    System.out.println("Invalid weight");
                }
            }

            // Height input
            while (true) {
                System.out.print("Enter height (meters): ");
                personData[i][1] = input.nextDouble();

                if (personData[i][1] > 0) {
                    break;
                } 
                else {
                    System.out.println("Invalid height");
                }
            }
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < number; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];

            // BMI formula
            personData[i][2] = weight / (height * height);

            // BMI status as per given table
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } 
            else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } 
            else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } 
            else {
                weightStatus[i] = "Obese";
            }
        }

        // Display height, weight, BMI, and status
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("Height: " + personData[i][1] + " meters");
            System.out.printf("BMI: %.2f\n", personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
        }

        input.close();
    }
}
