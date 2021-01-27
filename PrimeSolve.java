import java.io.*;
import java.util.*;
import java.lang.*;
class PrimeSolve
{

	Scanner s=new Scanner(System.in);
	
	int lb,ub,check,index=0;
	int[] arr;
	void get()
	{
		lb=s.nextInt();
		ub=s.nextInt();
		for (int i=lb;i<=ub ;i++ ) 
		{
			check=isPrime(i);
			if(check>0)
			{
				arr[index]=i;
				index++;
			}

		}


	}
	int isPrime(int no)
	{
		no=Math.abs(no);
		for (int i=2;i<no ;i++ ) 
		{
			if(no%i==0)
			{
				return 0;
			}
		}
		return 1;
	}
	void display()
	{
		for (int i=0;i<=index-1 ;i++ ) 
		{
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) 
	{
		try{
		BufferedReader s2=new BufferedReader(new InputStreamReader(System.in));
	
		int n=0;
		
		System.out.println("Enter Number ");
		n=Integer.parseInt(s2.readLine());
		
		PrimeSolve[] pm=new PrimeSolve[n];
		for (int i=1;i<=n ;i++ ) 
		{
			pm[i].get();

		}
		for(int i=0;i<n;i++)
		{
			pm[i].display();
		}
		}catch(Exception e){
			System.out.println(e);
		}
	}
	

}