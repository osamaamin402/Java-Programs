import java.io.*;
import java.util.*;
import java.lang.*;
class OctalToDec
{

		int num;
		String num2;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		void input()
		{

				try{

				System.out.println("Enter Octal Number");
				num=Integer.parseInt(br.readLine(),8);
				
				
				
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
		OctalToDec s=new OctalToDec();
		s.input();
		s.output();
	}
	
}