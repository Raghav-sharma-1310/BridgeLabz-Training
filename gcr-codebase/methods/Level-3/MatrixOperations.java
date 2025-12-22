import java.util.Random;

public class MatrixOperations {

    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int columns) {
        Random random = new Random();
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(9) + 1; // values 1–9
            }
        }
        return matrix;
    }

    // Method to find transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] transpose = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Method to calculate determinant of 2x2 matrix
    public static int calculateDeterminant(int[][] matrix) {
        return (matrix[0][0] * matrix[1][1]) -
               (matrix[0][1] * matrix[1][0]);
    }

    // Method to calculate inverse of 2x2 matrix
    public static double[][] calculateInverse(int[][] matrix) {

        int determinant = calculateDeterminant(matrix);

        if (determinant == 0) {
            return null;
        }

        double[][] inverse = new double[2][2];

        inverse[0][0] =  matrix[1][1] / (double) determinant;
        inverse[0][1] = -matrix[0][1] / (double) determinant;
        inverse[1][0] = -matrix[1][0] / (double) determinant;
        inverse[1][1] =  matrix[0][0] / (double) determinant;

        return inverse;
    }

    // Method to display int matrix (overloaded)
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%4d", value);
            }
            System.out.println();
        }
    }

    // Method to display double matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%8.3f", value);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int rows = 2;
        int columns = 2;

        int[][] matrix = createRandomMatrix(rows, columns);

        System.out.println("Original Matrix:");
        displayMatrix(matrix);

        System.out.println("\nTranspose Matrix:");
        int[][] transpose = transposeMatrix(matrix);
        displayMatrix(transpose);

        int determinant = calculateDeterminant(matrix);
        System.out.println("\nDeterminant: " + determinant);

        System.out.println("\nInverse Matrix:");
        double[][] inverse = calculateInverse(matrix);

        if (inverse != null) {
            displayMatrix(inverse);
        } else {
            System.out.println("Inverse does not exist (Determinant is 0)");
        }
    }
}
