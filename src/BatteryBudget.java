
import java.util.Scanner;

public class BatteryBudget {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double charges;
        double minutesPerCharge;
        double costPerCharge;
        boolean validInput;

        // 1. Number of full battery charges (0 or greater)
        do {
            System.out.print("Enter number of full battery charges available: ");
            if (scan.hasNextDouble()) {
                charges = scan.nextDouble();
                if (charges >= 0) {
                    validInput = true;
                } else {
                    System.out.println("Error: Must be 0 or greater.");
                    validInput = false;
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scan.next();
                validInput = false;
                charges = 0;
            }
        } while (!validInput);

        // 2. Minutes of operation per full charge (greater than 0)
        do {
            System.out.print("Enter minutes of robot operation per full charge: ");
            if (scan.hasNextDouble()) {
                minutesPerCharge = scan.nextDouble();
                if (minutesPerCharge > 0) {
                    validInput = true;
                } else {
                    System.out.println("Error: Must be greater than 0.");
                    validInput = false;
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scan.next();
                validInput = false;
                minutesPerCharge = 0;
            }
        } while (!validInput);

        // 3. Cost to recharge one battery fully (greater than 0)
        do {
            System.out.print("Enter cost in dollars to recharge one battery fully: ");
            if (scan.hasNextDouble()) {
                costPerCharge = scan.nextDouble();
                if (costPerCharge > 0) {
                    validInput = true;
                } else {
                    System.out.println("Error: Must be greater than 0.");
                    validInput = false;
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scan.next();
                validInput = false;
                costPerCharge = 0;
            }
        } while (!validInput);

        // Calculations
        double totalMinutes = charges * minutesPerCharge;
        double costPerHour = (60.0 / minutesPerCharge) * costPerCharge;

        // Output with two decimal places
        System.out.printf("Total available minutes: %.2f%n", totalMinutes);
        System.out.printf("Cost to run the robot for 60 minutes: $%.2f%n", costPerHour);
    }
}
