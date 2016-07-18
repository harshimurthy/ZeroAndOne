import java.util.*;

public class Reverse_String_344
{
	public String rev_str(String str)
	{
		String rev;
		int j = 0;
		for(int i = str.length()-1;i >= 0; i-- , j++)
		{
			rev.charAt(j)=str.charAt(i);
		}
		return rev;
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("\n Enter a string to reverse it:");
		String str=scan.next();
		System.out.println("The reversed string is:"+rev_str);
	}
}