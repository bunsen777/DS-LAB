import java.util.*;

public class TokenRing
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the total nodes for tokenring");
int n=sc.nextInt();
System.out.println("tokenring formed is:");
for(int i=0;i<n;i++)
{System.out.print(" "+i);
}
System.out.println("0");
int ch=0;
int i=0;
int token=0;
do{
System.out.println("Enter the sender");
int s=sc.nextInt();
System.out.println("Enter the receiver");
int r=sc.nextInt();
System.out.println("Enter the data");
int data=sc.nextInt();

System.out.print("token passing");
for(i=token;i<s;i++)
{
System.out.print(i+"->");
}

System.out.println(s);
for(i=s;i!=r;i=(i+1)%n)
{
System.out.println("data forwarded by"+i);

}
System.out.println("receiver recived the data");
System.out.println("do you want to send again? 1 for yes and 0 for no");
token=s;
ch=sc.nextInt();
}while(ch==1);
}
}
