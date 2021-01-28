import java.io.*;
import java.util.*;
class Sort
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int[] arr;
	int n;
	void input()
	{
		try{

		System.out.println("Enter Size of Array : ");
		n=Integer.parseInt(br.readLine());
		arr=new int[n];
		for (int i=0;i<n ;i++ ) 
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		}catch(Exception e){}
	}
	void output()
	{
		for (int i=0;i<n ;i++ ) 
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args)
	{
		Sort s=new Sort();
		s.input();
		s.output();
	}
}