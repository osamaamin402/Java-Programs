import java.io.*;
import java.util.*;
import java.lang.*;
class Str 
{

		String str;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		void input()
		{

				try{

				System.out.println("Enter String");
				str=br.readLine();
				
					}
					catch (Exception e) {
		
					}

		}
		void output()
		{
			StringBuilder re=new StringBuilder();
			re.append(str);
			re=re.reverse();

				System.out.println(re);



		}
	public static void main(String[] args) 
	{
		Str s=new Str();
		s.input();
		s.output();
	}
	
}