import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ExceptionHandling0 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        int a,b;
        Scanner scan=new Scanner(System.in);
        try
        {
        a=scan.nextInt();
        b=scan.nextInt();
            if(b!=0)
                System.out.println(a/b);
            if(b==0)
                System.out.println("java.lang.ArithmeticException: / by zero");
        }
        catch(Exception e)
            {
            System.out.println("java.util.InputMismatchException");
        }
       
    }
}