import java.rmi.*;
import java.rmi.server.*;

public class CalculatorImpl extends UnicastRemoteObject implements Calculator {
    protected CalculatorImpl() throws RemoteException {
        super();
    }
    public int sum(int a, int b) throws RemoteException {
        return a + b;
    }
    public int difference(int a, int b) throws RemoteException {
        return a - b;
    }
}
