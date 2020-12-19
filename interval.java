import java.io.*;
import java.util.*;
public class interval
	{
        public static void main(String[] args)
        {
		int i,n,m,sum;
		sum=0;
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the Starting no");
		n=inp.nextInt();
		n=n+1;
		System.out.println("Enter the Ending no");
		m=inp.nextInt();
		for(i=n;i<m;i++)
		{
			sum=sum+i;
			System.out.println("Sum of Interval no:"+sum);
		}
	}
	}
	 