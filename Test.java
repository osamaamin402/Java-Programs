import java.util.*;

public class Test {

    int[] arr;
    int n;
    int temp;
    void get()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Size Of Array : ");
        n=s.nextInt();
        arr=new int[n];
        System.out.println("Enter Elements Of Array : ");
        for (int i=0;i<n ;i++ )
        {
            arr[i]=s.nextInt();
        }
        for (int j=0;j<n-1 ;j++ )
        {
            for (int k=0;k<n-j-1 ;k++ )
            {
                if (arr[k]>arr[k+1])
                {
                    temp=arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=temp;

                }
            }
        }
      
        System.out.println("\n\n ");

    }
    void display()
    {
        for (int ab=0;ab<n ;ab++ )
        {
            System.out.println(arr[ab]);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int lp;
        lp=sc.nextInt();
        Test[] b=new Test[lp];

        for (int cd=0;cd<lp ;cd++ )
        {
            b[cd] = new Test();
            b[cd].get();

        }

        for (int cd=0;cd<lp ;cd++ )
        {
            b[cd].display();

        System.out.println("\n\n ");

        }

    }



}