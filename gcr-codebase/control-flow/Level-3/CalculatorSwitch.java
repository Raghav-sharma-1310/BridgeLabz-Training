import java.util.Scanner;
// Creating a class with name CalculatorSwitch to find the 
public class CalculatorSwitch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double first = input.nextDouble();
        double second = input.nextDouble();
        String op = input.next();

        // Switch-case to perform calculation
        switch (op) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;

            case "-":
                System.out.println("Result: " + (first - second));
                break;

            case "*":
                System.out.println("Result: " + (first * second));
                break;

            case "/":
                if (second != 0) {
                    System.out.println("Result: " + (first / second));
                } else {
                    System.out.println("Division by zero not allowed");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }

        input.close();
    }
}
