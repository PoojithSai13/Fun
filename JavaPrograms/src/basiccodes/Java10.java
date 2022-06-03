/*Name: Poojith Sai Geesala
Enrolment no: EBEON0322579270;
Program: Understanding CHAR Array and STRING */
package basiccodes;

public class Java10
{
	public static void main(String args[]) 
	{
		int i;
		char name[]= {'a','b','c','d','e'};
		
		
		
		System.out.print("Without String Concepts: ");
		for(i=0;i<5;i++)
		System.out.print(name[i]);
		System.out.print("\nthe no of characters in array are : "+i);
		
		
		String str="abcde";
		System.out.println("\nWith String Concepts:"+str);
		
		System.out.println("The length of the string is : "+str.length());
	}
}

