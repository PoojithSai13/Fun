/*Name: Poojith Sai Geesala
Enrolment no: EBEON0322579270;
Program: Understanding IF-ELSE Statement*/
package basiccodes;
import java.util.Scanner;
public class Java9 
{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter your Age:   ");
			int age = sc.nextInt();		
			if(age>=18)
				System.out.println("Elegible for Vote");
			else
				System.out.println("Not Elegible to put vote");
			sc.close();
		}

}