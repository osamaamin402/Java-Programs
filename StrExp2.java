import java.io.*;
import java.util.*;
class StrExp2
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String str;
	String str2="";


	void input()
	{
		try
		{
			System.out.println("Enter String ");
			str=br.readLine();
			String[] strarr=str.split(" ");
			for (int i=strarr.length-1;i>=0 ;i-- ) 
			{
				str2+=strarr[i] + " ";
			}

			System.out.println(str2);
		}
		catch(Exception e){}
	}
	void rev()
	{
		StringBuilder sb=new StringBuilder();
		sb.append(str);
		sb.reverse();
		System.out.println(sb);
	}
	public static void main(String[] args) {
		StrExp2 e2=new StrExp2();
		e2.input();
		e2.rev();
	}
}