import java.util.Scanner;

public class TrailDistance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double kilometers;
        double miles;
        boolean validInput;

        // Convert kilometers to miles (1 km = 0.621371 miles)
        do {
            System.out.print("Enter the distance in kilometers: ");
            if (in.hasNextDouble()) {
                kilometers = in.nextDouble();
                if (kilometers >= 0) {
                    validInput = true;
                } else {
                    System.out.println("Error: Distance must be 0 or greater.");
                    validInput = false;
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                in.next(); // clear the invalid input
                validInput = false;
                kilometers = 0; // temporary value
            }
        } while (!validInput);

        miles = kilometers * 0.621371;

        // Print results with two decimal places, aligned columns
        System.out.printf("%-12s %8.2f%n", "Kilometers:", kilometers);
        System.out.printf("%-12s %8.2f%n", "Miles:", miles);
    }
}
