import java.util.Scanner;
public class ATMsimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int correctPin = 1234;
        int maxAttempts = 3;
        double balance = 1000.00;
        boolean isLoggedOut = false;

        while (maxAttempts > 0) {
            System.out.println("=====SIMPLE ATM=====");
            System.out.println("Enter your PIN: ");
            int enteredPin = scanner.nextInt();

            if (enteredPin == correctPin) {
                System.out.println("Login successful!");
                isLoggedOut = true;
                break;
            }else {
                maxAttempts--;
                System.out.println("Incorrect PiN.");

                if (maxAttempts > 0) {
                    System.out.println("Remaining attempts: " + maxAttempts);
                }else {
                    System.out.println("Your account has been blocked.");
                }
            }
        }

        if (isLoggedOut == false) {
            scanner.close();
            return;
        }

        int choice = 0;

        while (choice != 4) {
            System.out.println("=====ATM MENU=====");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Exit");
            System.out.println("Choose an option: ");

            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Current balance: $" + balance);
            }else if (choice == 2) {
                System.out.println("Enter deposit amount: ");
                double deposit = scanner.nextDouble();

                if (deposit > 0) {
                    balance = balance + deposit;
                    System.out.println("Your new balance is: $" + balance);
                }else {
                    System.out.println("Invalid amount. Must be greater than zero!");
                }
            }else if (choice == 3) {
                System.out.println("Enter withdrawal amount: ");
                double withdrawal = scanner.nextDouble();

                if (withdrawal <= 0) {
                    System.out.println("Invalid amount. Must be greater than zero!");
                }else if (withdrawal > balance) {
                    System.out.println("Error: Not enough money in your account!");
                }else {
                    balance = balance - withdrawal;
                    System.out.println("Your new balance is: $" + balance);
                }
            }else if (choice == 4) {
                System.out.println("Thank you for using Simple ATM !");
            }else {
                System.out.println("Invalid choice. Please choose between 1 and 4.");
            }
        }

        scanner.close();
    }
}