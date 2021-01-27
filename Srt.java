import java.util.*;
import java.io.*;
class Srt
{
String a,b,c;
Scanner s=new Scanner(System.in);
void get()
{try{
System.out.println("Enter a :");
a=s.nextLine();
System.out.println("Enter b :");
b=s.nextLine();
c=a+b;
System.out.println("Concated String is :"+c);
	}catch(Exception e){}
}
public static void main(String ar[])
{
	Scan ss=new Scan();
	ss.get();
}
} 