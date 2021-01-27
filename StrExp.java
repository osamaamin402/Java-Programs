
import java.io.*;
import java.util.*;

class StrExp
{
	Scanner s=new Scanner(System.in);
	
	String abc;
	String strres="";
	void input()
	{
		try{
		System.out.print("Enter a string : ");
		abc=s.nextLine();
		String str[]=abc.split(" ");
		int len=str.length-1;


		for(int i=len; i>=0 ; i-- ) 
		{

			strres+=str[i]+" ";
		}
	}
	catch (Exception e) 
	{
		
	}

	}
	void output()
	{
		System.out.println("reverse : "+strres);
	}

	public static void main(String args[]) 
	{
		StrExp st=new StrExp();
		st.input();
		st.output();
      
     }
}