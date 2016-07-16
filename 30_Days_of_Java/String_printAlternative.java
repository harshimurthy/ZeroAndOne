import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class String_printAlternative {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        String str;
        int i,j,k,n;
        if(T>=1 && T<=10)
        {
            for(i=1;i<=T;i++)
            {
                str=scan.next();
                n=str.length();
                for(j=0;j<n;j=j+2)
                    System.out.print(str.charAt(j));
                System.out.print(" ");
                for(k=1;k<n;k=k+2)
                    System.out.print(str.charAt(k));
                System.out.println("");
            }
        }
    }
}