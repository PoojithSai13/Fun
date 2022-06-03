/*Name: Poojith Sai Geesala
Enrolment no: EBEON0322579270;
Program: Understanding Factorial number*/
//package basiccodes;
/*import java.util.*;
 * 
 * 
 * 
 * 
public class Java14 
{
	 public static void main(String[] args) 
	 {

		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter number for factorial=");
		  double number = sc.nextDouble();
		  System.out.println("factorial of "+number+ " is "+ factorial(number));
	 }
	 static double factorial(double number) 
	 {
		  if(number==0)
		   return 1;
		  
		  return number*factorial(number-1);
	 }
}
Name: Poojith Sai Geesala
Enrolment no: EBEON0322579270;
Program: Understanding Factorial number*/
package basiccodes;

public class Java14 
{
	public static void main(String[] args) 
	{
		System.out.println(factorial(10));
	}
	public static int factorial(int num) 
	{
		if(num==0) 
		{
			return 1;
		}
		else 
		{
			int n=num*factorial(num-1);
			return n;
		}
	}
}
	
