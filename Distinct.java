import java.io.*;
import java.util.*;
class Distinct
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner s=new Scanner(System.in);
			
			int size;
			System.out.println("Enter Size Of Array : ");
			size=s.nextInt();
			int arry[]=new int[size];
			for (int i=0;i<size ;i++ ) 
			{
				arry[i]=s.nextInt();
			}



			for (int i = 0; i < size; i++) 
        { 
            // Check if the picked element  
            // is already printed 
            int j; 
            for (j = 0; j < i; j++) 
            {
            if (arry[i] == arry[j]) 
                break;
        	} 
      
            if (i == j)
            { 
            System.out.print( arry[i] + " "); 
    		}
        } 



		}
		catch(Exception e){}
	}
}