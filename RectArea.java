import java.util.Scanner;

public class RectArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking length and breadth as input
        System.out.print("Enter the length: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth: ");
        double breadth = scanner.nextDouble();

        // Calculating the area
        double area = length * breadth;

        // Displaying the result
        System.out.println("The area of the rectangle is: " + area);
    }
}
