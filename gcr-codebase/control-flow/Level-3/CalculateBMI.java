import java.util.Scanner;
//create a class CalculateBMI to determine the weight status of the person
class CalculateBMI{
    public static void main(String [] args){
        // Create scanner object to take user input of variables weight and height
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the weight (in KG): ");
	double weight  = input.nextDouble();
	System.out.print("Enter the height (in cm): ");
	double height= input.nextDouble();
		
	//BMI calculation
	double 	bmi = weight / (height * height / 10000);

	// Displaying the status depending on the bmi value
	if ( bmi > 40.0)
	    System.out.println("Obese");
	else if ( bmi > 25.0 && bmi < 40.0)
	    System.out.println("Overweight");
	else if ( bmi > 18.5 && bmi < 25)
	    System.out.println("Normal");
	else if ( bmi <= 18.4)
	    System.out.println("Underweight");

    }
}