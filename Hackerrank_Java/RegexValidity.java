import java.util.Scanner;
import java.util.regex.*;

public class RegexValidity
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      System.out.println("\n Enter the number of test cases: ");
      int testCases = Integer.parseInt(in.nextLine());
      System.out.println("Test cases is :"+testCases);
      while(testCases>0){
        System.out.print("Enter the first pattern: ");
         String pattern = in.nextLine();
         System.out.print("Enter the first pattern: ");
           try
          {
    Pattern regex = Pattern.compile(pattern);
         System.out.println("Valid");
    }
    catch(Exception ex)
    {
        System.out.println("Invalid");
    }
      }
   }
}
