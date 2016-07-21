import java.util.*;

public class arr_print_rev
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("\n Enter the length of the string: ");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("\n Enter integers for the string: ");
		for(int i=0 ; i<n ; i++)
			arr[i] = scan.nextInt();
		System.out.println("\n Array in forward order is: ");
		for(int j=0 ; j<n ; j++)
			System.out.print(arr[j] + " ");
		System.out.println("\n Array in reverse order is: ");
		for(int j=n-1 ; j>=0 ; j--)
			System.out.print(arr[j]+ " ");
	}
}
