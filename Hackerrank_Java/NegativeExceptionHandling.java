import java.util.*;

class PowerExceptions
{
	int power(int a,int b) throws Exception
	{
		if(a<0 || b<0)
			throw new Exception("n and p should be non-negative");
		return (int)Math.pow(a,b);
	}
}

class NegativeExceptionHandling
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("\n Enter 2 numbers to check the power of :");
		int a=scan.nextInt();
		int b=scan.nextInt();

		//Since PowerExceptions is in different class, an object has to be first created
		PowerExceptions n=new PowerExceptions();
		try
		{
			System.out.println(n.power(a,b));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}

