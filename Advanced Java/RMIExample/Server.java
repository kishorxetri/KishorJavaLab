import java.rmi.*;

public class Server {
    public static void main(String[] args) {
        try {
            CalculatorImpl calc = new CalculatorImpl();
            Naming.rebind("rmi://localhost:5000/CalcService", calc);
            System.out.println("Server is ready...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
