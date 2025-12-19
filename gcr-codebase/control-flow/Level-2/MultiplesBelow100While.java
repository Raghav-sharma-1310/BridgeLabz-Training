import java.util.*;
// Creating a class with name MultiplesBelow100While to find all the multiples of a number taken as user input below 100 usiing while loop
public class MultiplesBelow100While {
    public static void main(String[] args) {
        // Creating scanner object to take number variable as user input
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int counter = 100;

        // Checking number is below 100
        if (number > 0 && number < 100) {
 
            // Loop for find all multiples below 100
            while ( counter >= 1){
	       if( counter % number == 0){
		    System.out.println(counter);
	       }
	       counter--;
             }
        } 
        else {
            System.out.println("Invalid output");
        }
     }
}