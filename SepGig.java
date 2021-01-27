import java.io.*;
import java.util.*;
class SepGig
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=0,sum=0;
		System.out.println("Enter Number : ");
		a=s.nextInt();
		while(a!=0)
		{
			int digit=a%10;
			a=a/10;

		System.out.println("Last Digit : "+digit);
		 sum=sum+digit;
		}
		System.out.println(sum);
	}
}