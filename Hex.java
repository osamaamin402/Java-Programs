import java.io.*;
import java.util.*;
import java.lang.*;
class Hex
{

		int num,num2;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		void input()
		{

				try{

				System.out.println("Enter HexaDecimal Number");
				num=Integer.parseInt(br.readLine(),16);
				
				
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
		Hex s=new Hex();
		s.input();
		s.output();
	}
	
}