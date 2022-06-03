/*Name: Poojith Sai Geesala
Enrolment no: EBEON0322579270;
Program: Understanding OOP and STRING */

package basiccodes;

import java.util.Scanner;

class Source  
{
	String checkName(String firstName,String lastName) throws Exception 
	{
		try {
			String a= firstName+lastName;
			if (a.isEmpty()) 
			{
				System.out.println("empty string");
			}
			else 
			{
				return a ;
			}
		}
		catch(NullPointerException e) 
		{
			System.out.println("empty string");
		}
		return lastName;
		
	}

}

public class Java16 
{

	public static void main(String[] args) throws Exception
	{
		System.out.println("Enter first Name :");
		Scanner s1 = new Scanner(System.in);
		String fname=s1.nextLine();
		System.out.println("Enter last Name :");
		String lname=s1.nextLine();
		Source obj= new Source();
		String a1= obj.checkName(fname,lname);
		System.out.println(a1);
		s1.close();
	}

}
