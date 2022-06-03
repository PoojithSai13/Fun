/*Name: Poojith Sai Geesala
Enrolment no: EBEON0322579270;
Program: Understanding nested IF-ELSE Statement*/
package basiccodes;
import java.util.Scanner;
public class Java8 
{
	public static void main(String args[]) 
	{
		String country;
		int age;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your age");
		age=sc.nextInt();
		System.out.println("Enter your country");
		country=sc.next();
		
		if(age>=18)
		{
			if(country.contains("india"))
				System.out.println("eligible");
			else
				System.out.println("Not India");
		}
		else
			System.out.println("Not 18 ");
		sc.close();


	}
}