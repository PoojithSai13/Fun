package basiccodes;
//Roshni and Sita 
public class JavaActivity
{

	public static void main(String[] args) 
	{
		int count=0;
		System.out.println("The paragraph is: ");
		String str="Today is a Monday and its boring day";
		System.out.println(str);
		//str=str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
				count++;
		}
		System.out.println(count);
	}

}
