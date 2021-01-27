import java.util.*;
import java.io.*;
class Scan
{
int a,b,c;
Scanner s=new Scanner(System.in);
void get()
{
System.out.println("Enter a :");
a=s.nextInt();
System.out.println("Enter b :");
b=s.nextInt();
c=a+b;
System.out.println(c);
}
public static void main(String ar[])
{
	Scan ss=new Scan();
	ss.get();
}
} 