import java.util.Scanner;

public class CornerGarden {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sideA;
        double sideB;
        boolean validInput;

        // Get length of first perpendicular side
        do {
            System.out.print("Enter the length of the first side (meters): ");
            if (in.hasNextDouble()) {
                sideA = in.nextDouble();
                if (sideA > 0) {
                    validInput = true;
                } else {
                    System.out.println("Error: Length must be greater than 0.");
                    validInput = false;
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                in.next();
                validInput = false;
                sideA = 0;
            }
        } while (!validInput);

        // Get length of second perpendicular side
        do {
            System.out.print("Enter the length of the second side (meters): ");
            if (in.hasNextDouble()) {
                sideB = in.nextDouble();
                if (sideB > 0) {
                    validInput = true;
                } else {
                    System.out.println("Error: Length must be greater than 0.");
                    validInput = false;
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                in.next();
                validInput = false;
                sideB = 0;
            }
        } while (!validInput);

        // Calculations using Pythagorean theorem
        double area = 0.5 * sideA * sideB;
        double hypotenuse = Math.sqrt(sideA * sideA + sideB * sideB);
        double perimeter = sideA + sideB + hypotenuse;

        // Output with two decimal places and aligned labels
        System.out.printf("%-20s %8.2f m²%n", "Area:", area);
        System.out.printf("%-20s %8.2f m%n", "Hypotenuse:", hypotenuse);
        System.out.printf("%-20s %8.2f m%n", "Perimeter:", perimeter);
    }
}

