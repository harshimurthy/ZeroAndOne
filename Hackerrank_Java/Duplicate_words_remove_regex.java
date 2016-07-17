import java.io.*;


/*
Program to remove repeated strings

Algorithm:
1. Make a regex pattern to detect duplicated words. 
2. Store string in A till this point.
3. Move to the string that is not repeated.
4. Put the remaining words in string B.
5. Attend A and B.
6. Continue this till the end.

Constraints:
Cases: (1-100)
Each string max: 10000
*/
class Duplicate_words_remove_regex
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("\n Enter the number of test cases: ");
		int testCases = scan.nextInt;
		String pattern=
		String str, A ,B ;
		if(N >= 1 && N <= 100)
		{
			while(N>0)
			{
				System.out.println("\n Enter the string: ");
				str = Scanner.nextLine();

				N--;
			}	

		}
		else
		{
			System.out.println("\n The number of test cases must be between 1 to 100 inclusive");
		}
	}
}

\b(\w+)(\s+\1\b)*