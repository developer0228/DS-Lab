import java.rmi.*;

public class Client
{
    public static void main(String args[])
    {
        try
        {
            Calc c=(Calc)Naming.lookup("rmi://localhost/Calc");

            System.out.println("Addition = "+c.add(10,5));

            System.out.println("Subtraction = "+c.sub(10,5));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}