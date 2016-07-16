import java.util.*;

public class Arrays_ReverseOrderPrint
{
	public static void main(String args[])
	{
		//to input from the keyboard
		Scanner scan=new Scanner(System.in);

		//declaring array;
		int arr[]=new int[100];

		//taking range of array
		System.out.println("\n Enter the range of array: ");
		int n=scan.nextInt();

		//Input array elements
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}

		//printing in reverse
		for(int j=n-1;j>=0;j--)
			System.out.println(arr[j]);

	}
}