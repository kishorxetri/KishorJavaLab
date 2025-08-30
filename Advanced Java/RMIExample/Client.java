import java.rmi.*;
public class Client {
    public static void main(String[] args) {
        try {
            // Lookup remote object
            Calculator calc = (Calculator) Naming.lookup("rmi://localhost:5000/CalcService");

            int a = 20, b = 10;
            System.out.println("Sum of " + a + " and " + b + " = " + calc.sum(a, b));
            System.out.println("Difference of " + a + " and " + b + " = " + calc.difference(a, b));

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
