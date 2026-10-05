import java.util.Scanner;
import java.util.Random;

public class TicketEstimate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        // Generate random ticket count once (20 to 35 inclusive)
        int actualTickets = rand.nextInt(16) + 20; // 0-15 + 20 → 20-35

        int guess = 0;
        boolean validGuess;

        // Get one valid guess using do-while
        do {
            System.out.print("Estimate the number of tickets sold (20-35): ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                if (guess >= 20 && guess <= 35) {
                    validGuess = true;
                } else {
                    System.out.println("Error: Please enter a number from 20 through 35.");
                    validGuess = false;
                }
            } else {
                System.out.println("Error: Please enter a whole number.");
                in.next(); // clear invalid input
                validGuess = false;
            }
        } while (!validGuess);

        // Reveal the result
        System.out.println("The actual number of tickets sold was: " + actualTickets);

        if (guess < actualTickets) {
            System.out.println("Your estimate was too low.");
        } else if (guess > actualTickets) {
            System.out.println("Your estimate was too high.");
        } else {
            System.out.println("Your estimate was exactly right!");
        }
    }
}
