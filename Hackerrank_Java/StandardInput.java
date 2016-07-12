import java.util.*;
public class StandardInput
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer value for a");
		int a=scan.nextInt();
		System.out.println("Enter an integer value for b");
		int b=scan.nextInt();
		System.out.println("Enter a string value now");
		String str=scan.next();

		System.out.println("\n\n\t A value is :"+a +" and the value for b is:"+b);
		System.out.println("\t The string value is :"+ str + "\n");
	}
}