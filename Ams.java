import java.util.*;
class Ams
{
	Scanner s=new Scanner(System.in);
	ArrayList<Integer> al=new ArrayList<Integer>();
	int n,count=0,ub,lb,sum=0,c=0,temp=0,temp2=0;
	void input()
	{
		System.out.println("Enter Range : ");
		lb=s.nextInt();
		ub=s.nextInt();
		for (int i=lb;i<=ub ;i++ ) {
			
		
		 temp=i;
		 temp2=i; 
			n=i;

			while(n!=0)
			{

			
				
				n/=10;
				count++;

				

			}
			
			
			while(temp!=0)
			{
				int rem=temp%10;
				temp/=10;
				
				sum=sum+(rem*rem*rem);
				

			}
			if(temp2!=sum)
			{
				sum=0;
				
			}
			else{
				al.add(i);
				sum=0;
				c++;
			}
		}

		

	}

	void output()
	{
		if (c>0) 
		{
			System.out.println(al);
			System.out.println("Armstrong Number in Range : "+lb+"  to :"+ub);
			for (int i=0;i<al.size() ;i++ ) 
			{
				System.out.print(al.get(i)+" \t");
			}
		}
		else{System.out.println("No found! ");}
	}
	public static void main(String[] args) {
		Ams ams=new Ams();
		ams.input();
		ams.output();
	}


}