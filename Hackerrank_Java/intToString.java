import java.util.*;

public class intToString
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String s=Integer.toString(n);
		if(n==Integer.parseInt(s))
			System.out.println("\n Successfull conversion!");
		else
			System.out.println("\n Uh oh!String could not be converted to integer");
	}
}