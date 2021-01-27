import java.io.*;
import java.util.*;
import java.lang.*;
class DecToHex
{

		int num;
		String num2;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		void input()
		{

				try{

				System.out.println("Enter Decimal Number");
				num=Integer.parseInt(br.readLine());
				num2=Integer.toHexString(num);
				
				
					}
					catch (Exception e) {
						System.out.println("Data type is not Comparable pleas valid data ");
		
					}

		}
		void output()
		{
			System.out.println(num2);

				



		}
	public static void main(String[] args) 
	{
		DecToHex s=new DecToHex();
		s.input();
		s.output();
	}
	
}