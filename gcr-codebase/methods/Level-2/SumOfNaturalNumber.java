import java.util.*;
class SumOfNaturalNumber {
    // Calculate Sum of Natural Number
    public static int sumOfNatural ( int number, int sum){
	if( number == 0 ){
              return sum;
        }
	sum += number;
	return sumOfNatural(number -1, sum);
    }
   
    public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	    
	System.out.print("Enter number : ");
	int number = input.nextInt();
	
        // Call method to return results
	int sum = sumOfNatural(number,0);
	
	// Displaying Output	
	System.out.println("The sum using recusive function : " + sum);
	System.out.println("The sum using recusive function : " + number*(number + 1)/2);
	
	input.close();  
    }
}