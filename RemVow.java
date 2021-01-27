import java.io.*;
import java.util.*;
class RemVow
{
	public static void main(String[] args) {
		String str;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String : " );
		str=s.nextLine();
		String str2=str.replaceAll("[aeiouAEIOU]","");
		String rep=str.replace("a","A");
		String rema=str.replaceAll("[a-z-A-Z]","");
		System.out.println(str2+"\n"+rep+"\n"+rema);
	}
}