import java.io.*;
import java.util.*;
class BubbleSort
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
		for (int j=0;j<n-1 ;j++ ) 
		{
			for (int k=0;k<n-j-1 ;k++ ) 
			{
				if (arr[k]>arr[k+1]) 
				{
					temp=arr[k];
					arr[k]=arr[k+1];
					arr[k+1]=temp;

				}
			}
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
		BubbleSort[] b=new BubbleSort[lp];
		
		for (int cd=0;cd<lp ;cd++ ) 
		{
			b[cd]=new BubbleSort();

			b[cd].get();
		
		}

		for (int cd=0;cd<lp ;cd++ ) 
		{
			b[cd].display();
		
		}
		
	}
}