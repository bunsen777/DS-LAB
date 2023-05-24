import java.rmi.*;
import java.rmi.server.*;
import java.lang.*;

public class Serverimpl extends UnicastRemoteObject implements Serverintf
{
public Serverimpl() throws RemoteException{}
public double Squarert(double n1)throws RemoteException
{

return Math.sqrt(n1);
}
}
