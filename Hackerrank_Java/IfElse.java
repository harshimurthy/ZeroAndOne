import java.util.*;

public class IfElse
{
	public static void main(String args[])
	{
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of the integer to check if it is odd or even");
		n=scan.nextInt();
		if(n%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
}