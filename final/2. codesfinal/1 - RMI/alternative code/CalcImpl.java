import java.rmi.*;
import java.rmi.server.*;

public class CalcImpl extends UnicastRemoteObject implements Calc
{
    CalcImpl() throws RemoteException {}

    public int add(int a,int b)
    {
        return a+b;
    }

    public int sub(int a,int b)
    {
        return a-b;
    }
}