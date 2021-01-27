import java.io.*;
import java.util.*;
class FindSpecialChar
{
	public static void main(String[] args) 
	{
		try
		{
			int count=0;
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter String : ");
			String str=br.readLine();
			int len=str.length();
			for (int i=0;i<len;i++) 
			{
				if (str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='a' && str.charAt(i)<='z') 
				{
					continue;
				}
				else if(str.charAt(i)>='0' && str.charAt(i)<=9)
				{
					continue;
				}
				else
				{
					count++;
				}
			}

		System.out.println("Spceial Char Count is : " + count);

		}catch(Exception e){}

	}
}