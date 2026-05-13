import java.net.*;
import java.io.*;

public class CalculatorClient {

    public static void main(String[] args) throws Exception {

        Socket s = new Socket("localhost", 5000);

        DataOutputStream out =
        new DataOutputStream(s.getOutputStream());

        DataInputStream in =
        new DataInputStream(s.getInputStream());

        out.writeInt(10);
        out.writeInt(20);

        int result = in.readInt();

        System.out.println("Addition = " + result);

        s.close();
    }
}