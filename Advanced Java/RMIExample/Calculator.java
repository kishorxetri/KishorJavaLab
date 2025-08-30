import java.rmi.*;
public interface Calculator extends Remote {
    public int sum(int a, int b) throws RemoteException;
    public int difference(int a, int b) throws RemoteException;
}
