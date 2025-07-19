import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;
        int originalNumber = number; // for display

        // Loop to extract digits and add to sum
        while (number != 0) {
            int digit = number % 10;     // Get last digit
            sum += digit;                // Add to sum
            number /= 10;                // Remove last digit
        }

        // Display result
        System.out.println("Sum of digits of " + originalNumber + " is: " + sum);
    }
}
