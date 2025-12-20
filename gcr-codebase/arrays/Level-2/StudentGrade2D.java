import java.util.*;
// Create a class with name StudentGrade2D
public class StudentGrade2D {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter number of students: ");
        int number = input.nextInt();

        // Arrays to store marks, percentange
        double[][] marks = new double[number][3];
        double[] percentage = new double[number];     

        // Take input for marks with validation
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

             System.out.print("Physics: ");
             marks[i][0] = input.nextDouble();

             System.out.print("Chemistry: ");
             marks[i][1] = input.nextDouble();

             System.out.print("Maths: ");
             marks[i][2] = input.nextDouble();

             if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                 System.out.println("Invalid marks");
                 i--;
                 continue;
             }
        }

        // Calculate percentage and grade
        for (int i = 0; i < number; i++) {
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            if(percentage[i] >= 80){
                   System.out.println("Percentage is " + percentage[i] + " Level 4, above agency-normalized standards");
            }
            else if( (percentage[i] >= 70) && (percentage[i] <= 79) ) {
                   System.out.println("Percentage is " + percentage[i] + " Level 3, at agency-normalized standards");
            }
            else if((percentage[i] >= 60) && (percentage[i] <= 69)) {
                   System.out.println("Percentage is " + percentage[i] + " Level 2, but approaching agency-normalized standards");
            }
            else if((percentage[i] >= 50) && (percentage[i] <= 59)){
                  System.out.println("Percentage is " + percentage[i] + " Level 1, well below agency-normalized standards");
            }
            else if((percentage[i]>= 40) && (percentage[i] <= 49)){
                  System.out.println("Percentage is " + percentage[i] + " Level 1, too below agency-normalized standards");
            }
            else if( percentage[i] <= 39 ){
                  System.out.println("Percentage is " + percentage[i] + " Reamedial standards");
           }
        }
        input.close();
    }
}
