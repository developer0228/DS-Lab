import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

class ClientThread extends Thread {

    public void run() {
        try {
            Registry reg = LocateRegistry.getRegistry("localhost", 1099);

            Hello obj = (Hello) reg.lookup("HelloService");

            String response = obj.message(Thread.currentThread().getName());

            System.out.println(response);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Client {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            ClientThread t = new ClientThread();
            t.setName("Client-" + i);
            t.start();
        }
    }
}