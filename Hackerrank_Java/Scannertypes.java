import java.util.Scanner;

public class ScannerTypes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d=scan.nextDouble();
        /*
        Whenever you use scan.nextInt, scan.nextDouble etc, it does not pick up the newLine character (often represented in text as \n). 
        So basically let's say within the buffer is "1.2341\n141\nSome Text\nSome More Text", 
        we could do scan.nextDouble(); scan.nextInt();, and that would leave us in the buffer "\nSome Text\nSome More Text".
        whenever you use scan.nextLine(), it takes everything until it hits a newLine character, 
        except here we're hitting a newLine IMMEDIATELY.
        This means that when we use scan.nextLine(), we get an empty String. 
        */
        scan.nextLine();
        String s=scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
