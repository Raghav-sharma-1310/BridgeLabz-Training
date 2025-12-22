public class NumberChecker3 {

    // Method to check Prime Number
    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }

        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check Neon Number
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sumOfDigits = 0;

        while (square != 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number;
    }

    // Method to check Spy Number
    public static boolean isSpyNumber(int number) {
        int sum = 0;
        int product = 1;
        int tempNumber = number;

        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            sum += digit;
            product *= digit;
            tempNumber /= 10;
        }
        return sum == product;
    }

    // Method to check Automorphic Number
    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    // Method to check Buzz Number
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    // Main method to test all number checks
    public static void main(String[] args) {

        int number = 7;

        System.out.println("Number: " + number);
        System.out.println("Is Prime Number : " + isPrimeNumber(number));
        System.out.println("Is Neon Number : " + isNeonNumber(number));
        System.out.println("Is Spy Number : " + isSpyNumber(number));
        System.out.println("Is Automorphic Number : " + isAutomorphicNumber(number));
        System.out.println("Is Buzz Number : " + isBuzzNumber(number));
    }
}
