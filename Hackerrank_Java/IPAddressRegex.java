import java.util.*;

public class IPAddressRegex
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		//To reference to the next class
		IPAdd ip=new IPAdd();
		while(scan.hasNext())
		{
			//System.out.println("\n Enter IP address to check its validity:");
			String IP=scan.next();
			System.out.println("\n"+IP.matches(ip.pattern));
		}
	}
}

class IPAdd
{
	public String pattern;
	public IPAdd()
	{
		String exp="(25[0-4]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
		pattern=exp+"\\."+exp+"\\."+exp+"\\."+exp;
	}
}