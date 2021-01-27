import java.io.*;
import java.util.*;
import java.lang.*;
class Binary 
{

		int num,num2;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		void input()
		{

				try{

				System.out.println("Enter Binary Number");
				num=Integer.parseInt(br.readLine(),2);
				
				
					}
					catch (Exception e) {
						System.out.println("Data type is not Comparable pleas valid data ");
		
					}

		}
		void output()
		{
			System.out.println(num);

				



		}
	public static void main(String[] args) 
	{
		Binary s=new Binary();
		s.input();
		s.output();
	}
	
}