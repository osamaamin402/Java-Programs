import java.io.*;
import java.util.*;
class RevStr
{
	String inputStr;
	String outputstr="";
	StringBuilder strRev=new StringBuilder();
	Scanner s=new Scanner(System.in);

	void input()
	{
		try{
		System.out.print("Enter String : ");
		inputStr=s.nextLine();

		String splt[]=inputStr.split(" ");
		
		for(int i=splt.length-1;i>=0;i--)
		{
			outputstr=outputstr+splt[i]+" ";
		}

			System.out.println("Reversed Sentence : " +outputstr);
			}catch(Exception e){}
	}
	void rev()
	{
		strRev.append(inputStr);
		strRev.reverse();
		System.out.println("Reversed String " +strRev);
	}
	public static void main(String[] args) {
		RevStr rs=new RevStr();
		rs.input();
		rs.rev();
	}
}