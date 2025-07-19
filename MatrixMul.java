import java.util.Scanner;

public class MatrixMul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions of first matrix
        System.out.print("Enter rows of first matrix: ");
        int m1 = sc.nextInt();
        System.out.print("Enter columns of first matrix: ");
        int n1 = sc.nextInt();

        // Input dimensions of second matrix
        System.out.print("Enter rows of second matrix: ");
        int m2 = sc.nextInt();
        System.out.print("Enter columns of second matrix: ");
        int n2 = sc.nextInt();

        // Check if matrices can be multiplied
        if (n1 != m2) {
            System.out.println("Multiplication is not possible.");
            return;
        }

        // Declare matrices
        int[][] A = new int[m1][n1];
        int[][] B = new int[m2][n2];
        int[][] product = new int[m1][n2];

        // Input first matrix
        System.out.println("Enterthe elements of first matrix:");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter the elements of second matrix:");
        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Matrix multiplication
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                for (int k = 0; k < n1; k++) {
                    product[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Display result
        System.out.println("Product of m*n matrices:");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
