import java.rmi.*;

public interface Calc extends Remote
{
    int add(int a,int b) throws RemoteException;

    int sub(int a,int b) throws RemoteException;
}
