import java.rmi.*;

public class Server
{
public static void main(String[]args)
{
try {
Serverimpl serverimpl =new Serverimpl();
Naming.rebind("Server",serverimpl);
System.out.println("server started");
}
catch(Exception e)
{System.out.println("error occured at"+e.getMessage());

}
}
} 
