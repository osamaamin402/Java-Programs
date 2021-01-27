class LeftPyramid
{
	public static void main(String ar[])
	{//left Pyramid
		for (int i=0;i<5 ;i++ ) 
		{
			for (int j=0;j<i ;j++ ) 
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	
	System.out.println("\n ");
		
		//left downword pyramid
		for (int i=0;i<5 ;i++ ) 
		{
			for (int j=5;j>i ;j-- ) 
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}




	
	System.out.println("\n ");
		
		// pyramid
		for (int i = 0; i <= 5; i = i + 1) {
    		for (int j = 0; j < 5-i; ++j) {
        		System.out.print(" ");
    		}
    		for (int j = 0; j <=i; ++j) {
        		System.out.print("* ");
   			 }
   		 System.out.println();
   		}





	
	System.out.println("\n ");
		
		// pyramid
		for(int i=1;i<=5;i++)
               {
	 for(int j=0;j<5-i;j++)
                       {
                               System.out.print(" ");
                       }
	
               for(int j=0;j<i;j++)
                       {
                               System.out.print("* ");
                       }
                     System.out.println();
               }           

	}
}