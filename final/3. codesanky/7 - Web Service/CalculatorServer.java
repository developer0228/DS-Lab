import java.net.*;
import java.io.*;

public class CalculatorServer {

    public static void main(String[] args) throws Exception {

        ServerSocket ss = new ServerSocket(5000);

        System.out.println("Server Started");

        Socket s = ss.accept();

        DataInputStream in =
        new DataInputStream(s.getInputStream());

        DataOutputStream out =
        new DataOutputStream(s.getOutputStream());

        int a = in.readInt();
        int b = in.readInt();

        int sum = a + b;

        out.writeInt(sum);

        System.out.println("Addition = " + sum);

        ss.close();
    }
}