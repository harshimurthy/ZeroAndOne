import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ExceptionHandling1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int a,b;
        Scanner scan=new Scanner(System.in);
        try
        {
            a=scan.nextInt();
            b=scan.nextInt();
            System.out.println(a/b);
        }
        catch(InputMismatchException ime)
        {
            System.out.println(ime.getClass().getName());
        }
        catch(ArithmeticException ae)
            {
            System.out.println(ae);
        }
    }
}