/*Name: Poojith Sai Geesala
Enrolment no: EBEON0322579270;
Program: Total no of vowels and consonants */

package basiccodes;

public class Java15 
{
	static byte i,Vcount=0,Ccount=0;
	static boolean methodA(char ch) 
	{
		ch=Character.toLowerCase(ch);
		return(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
	}

	static int Vowel(String str) 
	{
		for(i=0;i<str.length();i++) 
		{
			if(methodA(str.charAt(i))) 
			{
				++Vcount;
			}				
		}
		return Vcount;
	}
	static int Consonant(String str) 
	{
		for(i=0;i<str.length();i++) 
		{
			if(!methodA(str.charAt(i))) 
			{
				++Ccount;
			}			
		}
		return Ccount;
	}
	public static void main(String[] args) 
	{	
		System.out.println(Vowel("abcadeu"));
		System.out.println(Consonant("abcdeu"));
	}

}
