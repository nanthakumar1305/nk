import java.util.*;
public class oddoreven

	{
	public static void main(String[] args)
	{
		int number,reminder;
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the number");
		number=inp.nextInt();
		reminder=number%2;
		if(reminder==0)
		{
			System.out.println("This is an even number:"+number);
		}
		else
		{
			System.out.println("This is an odd number:"+number);
		}
		
	}
	}