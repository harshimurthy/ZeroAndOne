
import java.util.*;
public class Basics
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!, says Harshitha!! :)");

		Scanner scanner=new Scanner(System.in);
		String myString=scanner.next();
		int myInt=scanner.nextInt();
		scanner.close();
		System.out.println("My string is :"+myString);
		System.out.println("My int is: "+myInt);
	}
}

