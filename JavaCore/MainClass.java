// ThreadA: Even numbers from 50 to 100
class ThreadA implements Runnable {
    public void run() {
        System.out.println("\nThread A - Even numbers from 50 to 100:");
        for (int i = 50; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Newline after loop
    }
}

// ThreadB: Odd numbers from 100 to 200
class ThreadB implements Runnable {
    public void run() {
        System.out.println("\nThread B - Odd numbers from 100 to 200:");
        for (int i = 100; i <= 200; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Newline after loop
    }
}

// Main class to run both threads sequentially
public class MainClass {
    public static void main(String[] args) {
        // Create threads from Runnable instances
        Thread t1 = new Thread(new ThreadA());
        Thread t2 = new Thread(new ThreadB());

        // Start and wait for Thread A to finish
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Thread A interrupted.");
        }

        // Start and wait for Thread B to finish
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread B interrupted.");
        }
    }
}
