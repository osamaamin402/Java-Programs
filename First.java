import java.io.*;
class First
{
int a,b,c;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void show()
{
	try{
		System.out.println("Enter value of a ");
	a=Integer.parseInt(br.readLine());
		System.out.println("Enter value of b ");
	b=Integer.parseInt(br.readLine());
	
		System.out.println("Addition is : ");
	c=a+b;
System.out.println(c);
	}
	catch(Exception e){}
}
public static void  main(String args[])
{
	First f=new First();
	f.show();
}
}