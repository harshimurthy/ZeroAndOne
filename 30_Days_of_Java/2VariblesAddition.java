import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.rergex.*;

public class day2
{
    public static void main(String[] args)
    {
        int i=4;
        double d=4.0;
        String s="Hack";

        Scanner scan=new Scanner(System.in);        


        /* Declare second integer, double, and String variables. */
        int ii;
        double dd;       
        String str;
        //System.out.println(str);
    
        /* Read and save an integer, double, and String to your variables.*/
        ii= scan.nextInt();
        dd= scan.nextDouble();
        scan.nextLine();
        str = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+ii);       
       
        /* Print the sum of the double variables on a new line. */
		System.out.println(d+dd);

        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
         s=s.concat(str);
        System.out.println(s);

        scan.close();
    }
}
   
