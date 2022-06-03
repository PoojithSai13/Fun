package basiccodes;
//Name: Poojith Sai Geesala
//Enrolment no: EBEON0322579270;
//Program: Understanding SWITCH-CASE Statement.
public class Java6 
{
	public static void main(String arg[]) 
	{
        int a = 1;
        // Evaluating the expression that will return true or false
        switch(a)
        {
            case 1:
                System.out.println("Value of a: 1");
               // break;
            case 5:
                System.out.println("Value of a: 5");
                   break;
            case 10:
                System.out.println("Value of a: 10");
                break;
            default:
                System.out.println("else block");
               // break;
        }
    }
}
