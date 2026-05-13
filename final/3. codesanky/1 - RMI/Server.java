import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

    public static void main(String[] args) {
        try {
            HelloImpl obj = new HelloImpl();

            Registry reg = LocateRegistry.createRegistry(1099);
            reg.rebind("HelloService", obj);

            System.out.println("Server Started...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}