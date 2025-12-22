public class FactorUtility {

    // Method to find all factors of a number and return as an array
    public static int[] findFactors(int number) {

        // First loop: count the number of factors
        int factorCount = 0;
        for (int divisor = 1; divisor <= number; divisor++) {
            if (number % divisor == 0) {
                factorCount++;
            }
        }

        // Create array to store factors
        int[] factorsArray = new int[factorCount];
        int index = 0;

        // Second loop to store factors in the array
        for (int divisor = 1; divisor <= number; divisor++) {
            if (number % divisor == 0) {
                factorsArray[index++] = divisor;
            }
        }
        return factorsArray;
    }

    // Method to find the greatest factor using factors array
    public static int findGreatestFactor(int[] factorsArray) {
        return factorsArray[factorsArray.length - 1];
    }

    // Method to find the sum of factors
    public static int calculateSumOfFactors(int[] factorsArray) {
        int sum = 0;

        for (int factor : factorsArray) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of factors
    public static long calculateProductOfFactors(int[] factorsArray) {
        long product = 1;

        for (int factor : factorsArray) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of cubes of factors using Math.pow()
    public static double calculateProductOfCubes(int[] factorsArray) {
        double productOfCubes = 1;

        for (int factor : factorsArray) {
            productOfCubes *= Math.pow(factor, 3);
        }
        return productOfCubes;
    }

    public static void main(String[] args) {

        int number = 12;

        System.out.println("Number: " + number);

        int[] factorsArray = findFactors(number);

        System.out.print("Factors: ");
        for (int factor : factorsArray) {
            System.out.print(factor + " ");
        }
        System.out.println();

        System.out.println("Greatest Factor: " + findGreatestFactor(factorsArray));
        System.out.println("Sum of Factors: " + calculateSumOfFactors(factorsArray));
        System.out.println("Product of Factors: " + calculateProductOfFactors(factorsArray));
        System.out.println("Product of Cube of Factors: " + calculateProductOfCubes(factorsArray));
    }
}
