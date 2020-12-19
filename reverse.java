import java.io.*;
import java.util.*;
public class reverse
{
	public static void main(String args[])throws IOException
	{
	  Scanner inp=new Scanner(System.in);
	  System.out.println("Enter any string:");
      String a1=inp.nextLine();
      StringBuffer s=new StringBuffer(a1);
      System.out.println(s.reverse());

	}
}