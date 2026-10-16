import java.util.Scanner;
public class practiceATM {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("----- ATM Pin -----");
        int correctPin = 1234;
        int attempts = 3;

        while (attempts > 0) {
            System.out.println("Enter PIN: ");
            int enteredPin = scanner.nextInt();

            if (enteredPin == correctPin){
                System.out.println("Access granted!");
                break;
            }else {
                attempts--;
                System.out.println("Incorrect PIN.");

                if (attempts > 0) {
                    System.out.println("Attempts left: " + attempts);
                }else {
                    System.out.println("Attempts left: 0");
                    System.out.println("Card blocked.");
                }
            }
        }

        //2-task
        System.out.println("----- Guess the number -----");
        int secretNum = 7;
        int maxAttempts = 5;
        int attemptsUsed = 0;
        boolean isGuessed = false;

        while (attemptsUsed < maxAttempts && !isGuessed){
            System.out.println("Enter your guess: ");
            int guess = scanner.nextInt();
            attemptsUsed++;

            if (guess == secretNum) {
                System.out.println("Correct!");
                System.out.println("You needed " + attemptsUsed + " attempts.");
                isGuessed = true;
            }else if (guess < secretNum) {
                System.out.println("Too low!");
            }else {
                System.out.println("Too high!");
            }
        }
        if (!isGuessed) {
            System.out.println("Game over!");
        }

        //3-task
        System.out.println("----- Number statistics -----");
        int positiveNums = 0;
        int negativeNums = 0;
        int zeros = 0;
        int evenN = 0;
        int oddN = 0;

        for (int i = 1; i <= 10; i++){
            System.out.println("Enter number " + i + ": ");
            int num = scanner.nextInt();

            if (num > 0){
                positiveNums++;
            }else if (num < 0) {
                negativeNums++;
            }else {
                zeros++;
            }

            if (num % 2 == 0) {
                evenN++;
            }else {
                oddN++;
            }
        }

        System.out.println("=====STATISTICS=====");
        System.out.println("Positive numbers: " + positiveNums);
        System.out.println("Negative numbers: " + negativeNums);
        System.out.println("Zeros: " + zeros);
        System.out.println("Even numbers: " + evenN);
        System.out.println("Odd numbers: " + oddN);

        scanner.close();
    }
}
