public class NumberChecker4 {

    // Method to calculate sum of proper divisors (excluding the number itself)
    public static int calculateSumOfProperDivisors(int number) {
        int sumOfDivisors = 0;

        for (int divisor = 1; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                sumOfDivisors += divisor;
            }
        }
        return sumOfDivisors;
    }

    // Method to check Perfect Number
    public static boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false;
        }
        return calculateSumOfProperDivisors(number) == number;
    }

    // Method to check Abundant Number
    public static boolean isAbundantNumber(int number) {
        if (number <= 0) {
            return false;
        }
        return calculateSumOfProperDivisors(number) > number;
    }

    // Method to check Deficient Number
    public static boolean isDeficientNumber(int number) {
        if (number <= 0) {
            return false;
        }
        return calculateSumOfProperDivisors(number) < number;
    }

    // Method to calculate factorial of a digit
    private static int calculateFactorial(int digit) {
        int factorial = 1;

        for (int i = 1; i <= digit; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Method to check Strong Number
    public static boolean isStrongNumber(int number) {
        int tempNumber = number;
        int sumOfFactorials = 0;

        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            sumOfFactorials += calculateFactorial(digit);
            tempNumber /= 10;
        }
        return sumOfFactorials == number;
    }

    public static void main(String[] args) {

        int number = 28;

        System.out.println("Number: " + number);

        System.out.println("Is Perfect Number   : " + isPerfectNumber(number));
        System.out.println("Is Abundant Number  : " + isAbundantNumber(number));
        System.out.println("Is Deficient Number : " + isDeficientNumber(number));
        System.out.println("Is Strong Number    : " + isStrongNumber(number));
    }
}
