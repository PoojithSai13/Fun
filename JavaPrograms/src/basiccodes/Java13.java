 /*Name: Poojith Sai Geesala
Enrolment no: EBEON0322579270;
Program: Calculating percentage */
package basiccodes;
import java.util.Scanner;
public class Java13 
{
		    public static void main(String[] args) 
		    {
		        System.out.println("Find the % of total marks");
		        Scanner s1=new Scanner(System.in);
		        System.out.print("Enter the mark of A :");
		        float a = s1.nextFloat();
		        System.out.print("Enter the value of B :");
		        float b= s1.nextFloat();
		        System.out.print("Enter the value of C :");
		        float c= s1.nextFloat();
		        System.out.print("Enter the value of D :");
		        float d =s1.nextFloat();
		        System.out.print("Enter the value of E :");
		        float e= s1.nextFloat();
		        float percentage_is=((a+b+c+d+e)/500)*100;
		        System.out.println("The percentage of marks is : ");
		        
		        if(percentage_is>=60)
		        {
		            System.out.println("Congratulation you are Pass");
		        }
		        else
		        {
		            System.out.println("Sorry You Are Fail");
		        }
		        System.out.println(percentage_is);
		        s1.close();

	    }
	}