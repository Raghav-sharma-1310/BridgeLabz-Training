import java.util.*;
// Creating a class with name CanVote to check whether the student can vote
public class CanVote {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int studentsAge [] = new int[10];

        // Storing the Array values
        for(int i=0 ; i<studentsAge.length ; i++){
           studentsAge[i] = input.nextInt();
        }

        // Check whether student can vote or not.
        for(int j=0 ; j<studentsAge.length ; j++){
           if(studentsAge[j] >= 18){
              System.out.println("he student with the age " + studentsAge[j] + " can vote");
           }
           else if((studentsAge[j]>=0) && (studentsAge[j]<18)){
              System.out.println("he student with the age " + studentsAge[j] + " cannot vote");
           }
           else{
               System.out.println("Invalid Age");
           }
         }
         input.close();
     }
}