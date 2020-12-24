import java.io.*;
import java.util.*;
public class EbBill
{
	public static void main(String[] args) 
	{
		int id;
		String name;
		double unit, amount, surchareAmount, netAmount;
		amount = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ID Number: ");
		id = input.nextInt();
		System.out.println("Enter the Name: ");
		name = input.nextLine();
		System.out.println("Enter the Unit: ");
		unit = input.nextInt();
		if(unit <= 199)
		{
			amount = unit * 1.20;
			System.out.println("@Rs 1.20 per Unit: "+amount);
		}
		else if((unit >= 200) && (unit < 400))
		{
			amount = unit *1.50;
			System.out.println("@Rs 1.50 per Unit: "+amount);
		}
		else if((unit >= 400) && (unit < 600))
		{
			amount = unit * 1.80;
			System.out.println("@Rs 1.80 per Unit: "+amount);
		}
		else if(unit >= 600)
		{
			amount = unit * 2.00;
			System.out.println("@Rs 2.00 per Unit: "+amount);
		}
		if(amount < 100)
		{
			amount = 100.00;
			System.out.println("Minimum Amount is "+amount);
		}
		else if(amount >= 400)
		{
			surchareAmount = (amount * 15) / 100;
			netAmount = amount + surchareAmount;
			System.out.println("Surchare Amount: "+surchareAmount);
			System.out.println("Net Amount Paid by the Consumer: "+netAmount);
		}
	}
}