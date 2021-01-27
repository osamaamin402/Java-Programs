import java.io.*;
import java.util.*;
class Prime
{

	static int isPrime(int no)
	{
		no =Math.abs(no);
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				return 0;
			}
		}
		return 1;
	}

	public static void main(String str[])	
	{
		Scanner s=new Scanner(System.in);

		int sum=0,n=0,ub=0,lb=0;
		System.out.println("Enter  Range : ");
		lb=s.nextInt();
		ub=s.nextInt();
	
		for(int i=lb;i<=ub;i++)
		{
			n=isPrime(i);
	
			if(n>0)
			{
				 sum=sum+i;
			
			}
		}	
	
		System.out.println(sum);
	}
}