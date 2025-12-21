import java.util.*;

public class TrigonometricFunctions{
    // Calculate trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle){
         double[] trigonometricFunctions = new double[3];
         double radian = (3.14 / 180) * angle;
         double sine = Math.sin(radian);   // sin 
         double cosine = Math.cos(radian); // cos
         double tane = Math.tan(radian);   // tan 
         
         trigonometricFunctions[0]=sine;
         trigonometricFunctions[1]=cosine;
         trigonometricFunctions[2]=tane;
       
        return trigonometricFunctions;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of angle : ");
        double angle = input.nextDouble();
        
        // Call method to return results
        double result[] = calculateTrigonometricFunctions(angle);
        System.out.println("The Trigonometric functions are :  Sin = " + result[0] + " Cos = " + result[1] + " Tan = " + result[2]);
    }
}
