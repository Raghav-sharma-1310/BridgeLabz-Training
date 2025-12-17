import java.util.*;
//Creating Class with name MaximumNumberOfHandshakes indicating the purpose is to calculate maximum number of handshakes
class MaximumNumberOfHandshakes{
    public static void main(String args[]){
        // Creating Scanner object to take number of students as input
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = sc.nextInt();

        // Calculating maximum handshakes
        int maxHandShake = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Displaying number of possible handshakes
        System.out.println("Number of possible handshakes are " + maxHandShake);
    }
}