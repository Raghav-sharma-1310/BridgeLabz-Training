import java.util.*;
// Creating a class name MeanHeight to fid the mean height of the football players
public class MeanHeight {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double heights[] = new double[11];
        
        // Store value of height of 11 players
        for(int i=0; i<heights.length; i++){
           heights[i] = input.nextDouble();
        }
     
        // Calculating sum of all heights.
        double heightsSum = 0.0;
        for(int j=0; j<heights.length; j++){
           heightsSum += heights[j];
        }
        
        // Calculate mean height and print it
        double meanHeight = heightsSum / 11;
        System.out.println("The mean height of football team is " + meanHeight);
        
        input.close();
    }
}