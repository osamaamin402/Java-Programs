import java.io.*;
import java.util.*;
class RemoveChar
{
	public static void main(String[] args) 
	{
		try
		{
			String str;

			System.out.println("Enter String : ");
			Scanner s =new Scanner(System.in);
			str=s.nextLine().toLowerCase();
			String j=str.replaceAll("([a-z])","");
			System.out.println("Replaced String : " + j);
		}catch(Exception e){}
	}

}