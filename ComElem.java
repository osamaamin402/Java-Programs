import java.io.*;
import java.util.*;
class ComElem
{
	
	int n;

	Scanner s=new Scanner(System.in);

	void get()
	{
		try
		{
				System.out.println("Enter Array's size : ");
				n=s.nextInt();
				int[] arr1=new int[n];
				int[] arr2=new int[n];
				System.out.println("Enter Element in first Array : ");
				for(int i=0;i<n;i++)
				{
					arr1[i]=s.nextInt();
				}
				
				System.out.println("Enter Element in Second Array : ");
				for(int i=0;i<n;i++)
				{
					arr2[i]=s.nextInt();
				}




				
		for(int i=0;i<n;i++)
		{
			for (int j=0;j<n ;j++ ) 
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println("Matched Element : " + arr2[j]);
				}
			}
		}
		}
		catch(Exception e){}
	}
	

	public static void main(String ar[])
	{
		ComElem ce=new ComElem();
		ce.get();
	}


}