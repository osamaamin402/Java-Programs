import java.util.*;
class Replace
{
	Scanner s = new Scanner(System.in);
	String str1,str2,result;
	void get()
	{
		System.out.println("Enter Streing 1 : ");
		str1=s.nextLine();

		System.out.println("Enter Streing 2 : ");
		str2=s.nextLine();
	}

	void operation()
	{

		result=str1.replaceAll(str2,"");
		char[] chr=str1.toCharArray();
		for (int i=0;i<chr.length ;i++ )
		 {
			System.out.println(chr[i]);
		}
		

	}
	void display()
	{

		System.out.println("Replace String : " + result);


	}
	public static void main(String[] args)
	{
		Replace r = new Replace();
		r.get();
		r.operation();
		r.display();
	}
}