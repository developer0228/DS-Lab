import java.rmi.*;

public class Server
{
    public static void main(String args[])
    {
        try
        {
            Naming.rebind("Calc",new CalcImpl());

            System.out.println("Server Started");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}