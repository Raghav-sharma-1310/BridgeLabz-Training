import java.util.*;
// Creating a class with name CalculateGrade to  Compute the percentage and then calculate the grade 
public class CalculateGrade {
    public static void main(String[] args) {
        // Creating scanner object to take number variable as user input
        Scanner input = new Scanner(System.in);
        int physicsMark = input.nextInt();
        int chemistryMark = input.nextInt();
        int mathsMark = input.nextInt();
  
        // Calculate percenatage of obtained marks in pcm.
        double percentage = (physicsMark + chemistryMark + mathsMark) / 3;
      
        // Check for grade and remarks.  
        if(percentage >= 80){
           System.out.println("Percentage is " + percentage + " Level 4, above agency-normalized standards");
        }
        else if( (percentage >= 70) && (percentage <= 79) ) {
           System.out.println("Percentage is " + percentage + " Level 3, at agency-normalized standards");
        }
        else if((percentage >= 60) && (percentage <= 69)) {
            System.out.println("Percentage is " + percentage + " Level 2, but approaching agency-normalized standards");
        }
        else if((percentage >= 50) && (percentage <= 59)){
             System.out.println("Percentage is " + percentage + " Level 1, well below agency-normalized standards");
        }
        else if((percentage>= 40) && (percentage <= 49)){
             System.out.println("Percentage is " + percentage + " Level 1, too below agency-normalized standards");
        }
        else if( percentage <= 39 ){
             System.out.println("Percentage is " + percentage + " Reamedial standards");
        }
    }
}

