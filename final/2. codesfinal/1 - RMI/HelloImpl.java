import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class HelloImpl extends UnicastRemoteObject implements Hello {

    public HelloImpl() throws RemoteException {
        super();
    }

    public synchronized String message(String name) throws RemoteException {
        return "Hello " + name + " from Server";
    }
}