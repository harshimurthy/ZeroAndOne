import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrNegativeSum 
{

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int[] arr=new int[100];
        Scanner scan=new Scanner(System.in);
        int count=0,sum,i;
        System.out.print("\n Enter the length of the array: ");
        int n=scan.nextInt();
        System.out.println("\n Enter the numbers in the array: ");
        for(i=0;i<n;i++)
            arr[i]=scan.nextInt();
        System.out.println("\n The subarrays that lead to negative summation are: ");
        for(i=0;i<n;i++)
        {
            sum=0;
            for(int j=i;j<n;j++)
            {
                sum=sum+arr[j];
                if(sum<0)
                {
                    count++;
                    System.out.println("["+i+" "+j+"]");

                }
            }
            
        }
        System.out.println("\n The number of subarray that leads to a negative value is: "+count);
        
    }
}