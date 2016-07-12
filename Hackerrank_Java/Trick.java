import java.util.Scanner;
import java.util.*;

public class Trick
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int val=(int)Math.pow(4, 2);
		System.out.println(val);
		int num,a,b,n,sum=0;
		num=scan.nextInt();
		for(int i=1;i<=num;i++)
		{
			a=scan.nextInt();
			b=scan.nextInt();
			n=scan.nextInt();
			sum=a+b;

			for(int j=1;j<=n;j++)
			{
				System.out.print(sum+" ");
				sum=sum+((int)Math.pow(2,j))*b;
				
			}
			System.out.println("");
			sum=0;

		}
	}
}