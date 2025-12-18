import java.util.*;
//Creating Class with name AreaOfTriangle indicating the purpose is to calculate area of a triangle
class AreaOfTriangle{
    public static void main(String args[]){
         // Creating Scanner object to take base and height as input
         Scanner input = new Scanner(System.in);
         double base = input.nextDouble();
         double height = input.nextDouble();

         // Calculating area in square centimeters and square inches.
         double areaCm = 0.5 * base * height;
         double areaInches = areaCm / (2.54 * 2.54);

         // Displaying area
         System.out.println("The Area of the triangle in sq in is " + areaInches + " and sq cm is " + areaCm);
    }
}