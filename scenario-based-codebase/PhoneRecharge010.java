import java.util.Scanner;

public class PhoneRecharge010 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 0;

        System.out.println("=========== Phone Recharge Simulator ===========");

        while (true) {
            System.out.print("\nEnter Mobile Operator (Jio / Airtel / VI) or 0 to exit: ");
            String operator = sc.nextLine();

            if (operator.equals("0")) {
                break;
            }

            System.out.print("Enter Recharge Amount: ");
            double amount = sc.nextDouble();
            sc.nextLine(); // consume newline

            balance += amount;

            System.out.println("\n-------- Recharge Details --------");
            System.out.println("Operator : " + operator);
            System.out.println("Amount   : " + amount);

            switch (operator) {
                case "Jio":
                case "jio":
                    System.out.println("Offer    : 1.5GB/day + Unlimited Calls");
                    break;

                case "Airtel":
                case "airtel":
                    System.out.println("Offer    : 2GB/day + Unlimited Calls + Wynk Music");
                    break;

                case "VI":
                case "vi":
                    System.out.println("Offer    : 1GB/day + Weekend Data Rollover");
                    break;

                default:
                    System.out.println("Offer    : Invalid Operator! No offer available.");
            }

            System.out.println("----------------------------------");
            System.out.println("Current Balance : " + balance);
        }

        System.out.println("\nThank you for using Phone Recharge Simulator ");
        sc.close();
    }
}
