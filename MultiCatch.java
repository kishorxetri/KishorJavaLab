public class MultiCatch {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        String text = null;

        try {
            // May throw ArithmeticException
            int result = 100 / 0;

            // May throw ArrayIndexOutOfBoundsException
            System.out.println(numbers[5]);

            // May throw NullPointerException
            System.out.println(text.length());

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Exception caught: " + e.getClass().getSimpleName());
            System.out.println("Message: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed: Cleaning up resources if any.");
        }

        System.out.println("Program continues after try-catch-finally.");
    }
}
