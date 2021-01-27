import java.io.*;
class DectoBin
{
	int dec;
	String bin;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	void input()
	{
		try{

			System.out.print("Enter Decimal Number : ");
			dec=Integer.parseInt(br.readLine(),10);
			bin=Integer.toBinaryString(dec);
		}
		catch (Exception e) {
			
		}
	}
	void output()
	{
		System.out.print("The Binary Number is : " + bin);
	}

	public static void main(String[] args) 
	{
		DectoBin dtb=new DectoBin();
		dtb.input();
		dtb.output();
	}
}