import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Html_tags{
   public static void main(String[] args)
   {
      
      Scanner scan = new Scanner(System.in);
      int Test_cases_no = Integer.parseInt(scan.nextLine());
      String exp = "<(.+?)>([^<>]+)</\\1>";
      while(Test_cases_no>0)
      {
      	String test = scan.nextLine();
      	Pattern p = Pattern.compile(exp);
      	Matcher m = p.matcher(test);
      	int count = 0;
      	while(m.find())
      	{
      		if(m.group(2).length()!=0)
      			System.out.println(m.group(2));
      		count++;

      	}
      	if(count==0)
      		System.out.println("None");
      	Test_cases_no--;
      }
   }
}
