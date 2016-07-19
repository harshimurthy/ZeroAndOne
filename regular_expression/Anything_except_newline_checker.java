// . helples match everything except newline

//recheck doesn't work

import java.util.*;
import java.util.regex.*;

class Anything_except_newline_checker
{
	public static void main( String args[])
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("\n Enter the testing string: ");
		String test_string = scan.nextLine();
		System.out.println("\n Enter the regular expression to be matched: ");
		String regexp = scan.nextLine();
		Pattern p = Pattern.compile(regexp);
		Matcher m = p.matcher(test_string);
		int count = 0;
		while (m.find())
		{
			count++;
		}
		System.out.println("\n The number of matches found are : "+ count);
	}
}