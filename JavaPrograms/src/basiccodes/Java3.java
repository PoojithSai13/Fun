package basiccodes;
//Name: Poojith Sai Geesala
//Enrolment no: EBEON0322579270;
//Program: Understanding IF-ELSE-IF Statement.
import java.util.*;
public class Java3 
{
	    public static void main(String arg[]) 
	    {
	        Scanner s=new Scanner(System.in);
	        int a;
	        System.out.println("Enter the value:");
	        a=s.nextInt();
	    	
	        // Evaluating the expression that will return true or false
	        if (a == 1)
	        	System.out.println("Value is 1 : "+a);
	        
	        // Evaluating the expression that will return true or false
	        else if(a >= 5)
	        {
	            System.out.println("Value is grater than 5 or it is 5 : "+a);
	        }
	        // Evaluating the expression that will return true or false
	        else if(a == 10)
	        {
	            System.out.println("Value is 10 : "+a);
	        }
	        else
	        {
	            System.out.println("else block");
	        }
	        s.close();
	   }
}
