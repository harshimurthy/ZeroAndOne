import java.io.*;
import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        // Write your code here.
        
       s=s.trim();
        if(s.length()<400000)
        {
           if(s.length()==0)
               System.out.println(s.length());
            else
                {
                String[] tokens=s.split("[!,?._'@\\ ]+");
                int count=tokens.length;
                System.out.println(count);
                for(int i=0;i<count;i++)
                    System.out.println(tokens[i]);
            }
        }
            
    }
}
