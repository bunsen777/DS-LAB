import java.rmi.*;
import java.util.*;

public class Client{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
try{
String serverURL="rmi://localhost/Server";
Serverintf serverintf=(Serverintf)Naming.lookup(serverURL);

System.out.println("Enter n1");
double n1=sc.nextDouble();
System.out.println("Enter n2");
double n2=sc.nextDouble();
System.out.println("REsults");
System.out.println(" square root is"+serverintf.Squarert(n1));

}

catch(Exception e){
System.out.println("error occured at client"+ e.getMessage());
}
}
}
