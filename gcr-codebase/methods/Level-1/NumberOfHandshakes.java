import java.util.*;
public class NumberOfHandshakes{
    // Calculating maximum handshakes
    public static int maximumNumberOfHandshakes(int numberOfStudents){
        int maxHandShake = (numberOfStudents * (numberOfStudents - 1)) / 2;
        return maxHandShake;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int numberOfStudents = input.nextInt();
        
        // Call maximumNumberOfHandshakes method
        int maximumHandshakes = maximumNumberOfHandshakes(numberOfStudents);

        // Display the result 
        System.out.println("The maximum number of handshakes are " +  maximumHandshakes);
    }
}
