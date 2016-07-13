import java.io.*;
import java.util.*;

public class Solution {

    static boolean isAnagram(String a, String b) {
        
if(a.length()!=b.length())
            return false;
        int flag=1;
        int count=0;
        for(int i=0;i<a.length();i++)
        {
            flag=0;
            for(int j=0;j<b.length();j++)
            {
                if(a.charAt(i)==b.charAt(j)) 
                    flag=1;
            }
            if(flag==1)
                count++;
        }
            if(count==a.length())
                return true;
            else
                return false;
                     
    }
  
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}