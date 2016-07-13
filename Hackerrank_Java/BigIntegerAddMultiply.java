import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BigIntegerAddMultiply{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        BigInteger b1=new BigInteger(scan.next());
        BigInteger b2=new BigInteger(scan.next());
        
        BigInteger badd,bmultiply;
        badd=b1.add(b2);
        bmultiply=b1.multiply(b2);
        System.out.println(badd+"\n"+bmultiply);
    }
}