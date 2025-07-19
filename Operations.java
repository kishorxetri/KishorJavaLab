import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking two integer inputs
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculating the required operations
        int sum = num1 + num2;
        int product = num1 * num2;
        double quotient = (num2 != 0) ? (double) num1 / num2 : Double.NaN; // check for divide by zero
        int remainder = (num2 != 0) ? num1 % num2 : 0;
        double average = (num1 + num2) / 2.0;

        // Displaying the results
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        if (num2 != 0) {
            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);
        } else {
            System.out.println("Quotient and Remainder: Cannot divide by zero");
        }
        System.out.println("Average: " + average);
    }
}
