import java.util.*;

public class StrLenCapital
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("\n Enter the first string: ");
		String a=scan.nextLine();
		System.out.print("\n Enter the second string: ");
		String b=scan.nextLine();
		int n=a.length();
		System.out.println("\n The lenght of first string is: "+n);
		int n1=b.length();
		System.out.println("\n The length of second string is :"+n1);
		if(a.compareToIgnoreCase(b)>0)
			System.out.println("A is lexically larger than B");
		
	}
}