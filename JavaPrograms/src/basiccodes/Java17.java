/*Name: Poojith Sai Geesala
Enrolment no: EBEON0322579270;
Program: Understanding IF-ELSE-IF */

package basiccodes;
import java.util.*;

public class Java17 
{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) 
    {
    	System.out.println("Enter a number: ");
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N%2==0)
        {
            if(N>2&&N<5)
            {
                System.out.println("Not Weird");
            }
            else if(N>=6&&N<=20)
            {
                System.out.println("Weird");
            }
            else
            {
                System.out.println("Not Weird");
            }
        }
        else
        {
            System.out.println("Weird");
        }
        scanner.close();
    }
}