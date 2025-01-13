import java.util.Scanner;

public class SimpleBankingApplication {
    private static double balance = 0; // Initial balance
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Simple Banking Application!");
        int choice;

        do {
            displayMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the banking application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\nPlease choose an option:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void deposit() {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.printf("Rs. %.2f has been deposited successfully.%n", amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    private static void withdraw() {
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.printf("Rs. %.2f has been withdrawn successfully.%n", amount);
            } else {
                System.out.println("Insufficient balance. Transaction failed.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    private static void checkBalance() {
        System.out.printf("Your current balance is: Rs. %.2f%n", balance);
    }
}
