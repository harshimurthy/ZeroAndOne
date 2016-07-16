import java.util.*;
class Count1s
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
		int length=result.length();
		System.out.println("\n Length of binary is :"+length);
		//int number=Integer.parseInt(result);
		//System.out.println("\n Binary number after parsing from string to integer : "+number);
		int maxcount=0,newcount=0;
		for(int i=0;i<length;i++)
		{
			System.out.println("Value: "+ result.charAt(i));
			if(result.charAt(i)=='1')
			{
				System.out.println("1 if statement reached");
				newcount++;
			}
			else if(result.charAt(i)=='0')
			{
				System.out.println("0 of statement reached");
				newcount=0;
			}
			System.out.println("Newcount"+newcount);
			if(newcount>maxcount)
				maxcount=newcount;
			System.out.println("Maxcount"+maxcount);
			
			
		}
		System.out.println("\n Maximum number of continuous 1s in "+result+" is "+maxcount);

		
	}
}