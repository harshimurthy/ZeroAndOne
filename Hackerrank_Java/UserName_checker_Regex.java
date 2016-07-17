/*
1.The username can contain alphanumeric characters and/or underscores(_).
2. The username must start with an alphabetic character.
3. 8 <= |Username| <= 30.
*/

import java.util.*;
import java.util.regex.*;

public class UserName_checker_Regex
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of text cases: ");
		int N = scan.nextInt();
		scan.nextLine();
		String str;
		String regex = "^[A-Za-z][a-zA-Z0-9_]{7,29}$";
		Pattern pattern = Pattern.compile(regex);
		while ( N>0 )
		{
			System.out.println("\n Enter test case number:"+ N);
			str = scan.nextLine();
			Matcher match = pattern.matcher(str);
			if (match.find())
				System.out.println(" \n Valid Username");
			else
				System.out.println("\n Invalid Username");
			N--;
		}

	}
}