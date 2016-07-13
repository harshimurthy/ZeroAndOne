import java.io.*;
import java.util.*;

public class StringPalindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String reverse = new StringBuffer(A).reverse().toString();
        System.out.println(reverse);
        if(A.compareTo(reverse)==0)
            System.out.println("Yes");
        else
            System.out.println("No");
        
    }
}
