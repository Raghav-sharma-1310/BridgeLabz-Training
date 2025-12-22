import java.util.*;

public class GeometryCalculator {

    // Method to calculate Euclidean distance between two points
    public static double calculateEuclideanDistance(
            double x1, double y1, double x2, double y2) {

        double distance = Math.sqrt(
                Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );
        return distance;
    }

    // Method to calculate slope (m) and y-intercept (b)
    // Returns array: index 0 -> slope (m), index 1 -> intercept (b)
    public static double[] calculateLineEquation(
            double x1, double y1, double x2, double y2) {

        double slope = (y2 - y1) / (x2 - x1);
        double intercept = y1 - (slope * x1);

        return new double[]{slope, intercept};
    }

    // Main method
    public static void main(String[] args) {

        // Input points
        double x1 = 2;
        double y1 = 3;
        double x2 = 6;
        double y2 = 7;

        System.out.println("Point A (" + x1 + ", " + y1 + ")");
        System.out.println("Point B (" + x2 + ", " + y2 + ")");

        // Calculate Euclidean distance
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("\nEuclidean Distance: " + distance);

        // Calculate line equation
        double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
        double slope = lineEquation[0];
        double intercept = lineEquation[1];

        System.out.println("\nEquation of Line:");
        System.out.println("y = " + slope + "x + " + intercept);
    }
}
