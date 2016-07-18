//1. Program to mention the number of "hackerrank"s present in the string

import java.util.*;
import java.util.regex.*;

class Matching_specific_string
{	
	public static void main(String args[])
	{	
		Regex rg = new Regex();
		rg.reg_ex_checking("hackerrank");
	}
}

class Regex
{
	public void reg_ex_checking(String exp_str)
	{
		Scanner scan = new Scanner(System.in);
		String test_str = scan.nextLine();
		Pattern p = Pattern.compile(exp_str);
		Matcher m = p.matcher(test_str);
		int count=0;
		//System.out.println("Value of m is : " + m);
		while(m.find())
		{
			System.out.println(m.find());
			count++;
		}
		System.out.println("\n Number of matches is: " + count);
	}
}