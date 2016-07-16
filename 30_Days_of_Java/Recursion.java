import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Recursion{

    static int factorial(int n)
    {
        if(n==1)
            return 1;
        return (n*factorial(n-1));
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        if(N>=2 && N<=20)
            System.out.println(factorial(N));
            
    }
    
}