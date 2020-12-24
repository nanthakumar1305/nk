import java.io.*;
public class Star
{
	public static void main(String[] args) 
	{
		int i , j , k;
	for(i = 5;i > = -5;i--)
	{
		for(j = 1;j< = Math.abs(i);j++)
		{
			System.out.print(" ");
		}
		for(k = 5;k > = Math.abs(i);k--)
		{
			System.out.print("* ");
		}
		System.out.println();
	}	
	}
	}