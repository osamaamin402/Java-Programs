import java.util.*;
class ArrayOfObect
{
	int[] arr;
	Scanner s=new Scanner(System.in);
	int n;
	int temp;
	void get()
	{
		System.out.println("Enter Size Of Array : ");
		n=s.nextInt();
		arr=new int[n];
		System.out.println("Enter Elements Of Array : ");
		for (int i=0;i<n ;i++ ) 
		{
			arr[i]=s.nextInt();
		}
		

	}
	void display()
	{
		for (int ab=0;ab<n ;ab++ ) 
		{
			System.out.println(arr[ab]);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int lp;
		lp=sc.nextInt();
		ArrayOfObect[] b=new ArrayOfObect[lp];
		
		for (int cd=0;cd<lp ;cd++ ) 
		{
			b[cd]=new ArrayOfObect();
			b[cd].get();
		
		}

		for (int cd=0;cd<lp ;cd++ ) 
		{
			b[cd].display();
		
		}
		
	}
}