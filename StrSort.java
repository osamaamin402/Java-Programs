import java.util.*;
class StrSort
{
	Scanner s = new Scanner(System.in);
	String[] sary;
	String str,sorted="";

	void input()
	{
		System.out.println("enter String : ");
		str=s.nextLine();
		sary=str.split("");
		Arrays.sort(sary);
		for (int i=0;i<sary.length ;i++ ) 
		{
			sorted+=sary[i];
		}

	}
	void output()
	{
		System.out.println(sorted);
	}
	public static void main(String[] args) {
		StrSort ss=new StrSort();
		ss.input();
		ss.output();
	}
}