import java.util.Scanner;
class Prime2
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
				int index2=0;
				arr=new int[index2];
				arr[index]=i;
				index++;
				index2++;
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
		Scanner s2=new Scanner(System.in);
	
		int n;
		
		System.out.println("Enter Number ");
		n=s2.nextInt();
		Prime2[] pm=new Prime2[n];
		for (int i=0;i<n ;i++ ) 
		{
			pm[i]=new Prime2();
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