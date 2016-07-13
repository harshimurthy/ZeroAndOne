
import java.util.*;

public class alphabetically
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String A=scan.nextLine();
		String B;
		int n;
		System.out.println("Enter the substring length: ");
		n=scan.nextInt();
		String small=A.substring(0,n);
		String great=small;
		System.out.println(small);
		for(int i=1;i<=A.length()-n;i++)
		{
			B=A.substring(i,i+n);
			System.out.println(B);
			 if(B.compareTo(great)>0)
                    great=B;
                else if(B.compareTo(small)<0)
                    small=B;

		}
		System.out.println("Smaller is :"+small);
		System.out.println("Greater is :"+great);
	}
}