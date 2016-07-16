import java.util.*;
class Binary_Numbers_DecimalToBinary_Count1s
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("\n Enter the decimal :");
		int n=scan.nextInt();
		String str="";
		int num=n,d;
		while(num>0)
		{
			d=num%2;
			str=str+d;
			System.out.println(d+" "+str);
			num=num/2;

		}
		String result = new StringBuffer(str).reverse().toString();
		System.out.println("\n Decimal is:"+ n + " Binary is: "+result);
		
	}
}