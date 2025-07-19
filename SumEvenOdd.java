public class SumEvenOdd {
    public static void main(String[] args) {
        int evenSum = 0;
        int oddSum = 0;

        // Loop from 1 to 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenSum += i; // even number
            } else {
                oddSum += i;  // odd number
            }
        }

        // Display the results
        System.out.println("Sum of even numbers from 1 to 100: " + evenSum);
        System.out.println("Sum of odd numbers from 1 to 100: " + oddSum);
    }
}
