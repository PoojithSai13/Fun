/*Name: Poojith Sai Geesala
Enrolment no: EBEON0322579270;
Program: Count no of unique Vovels and Consonants */

package basiccodes;
class Alphabets {
	int uniqueVowel(String str){
        byte Vcount=0;
        str=str.toLowerCase();
        char arr1[]={'a','e','i','o','u'};
        for(char c: arr1)
        {
            if(str.contains(""+c))
            {
                Vcount++;
            }
        }
        return Vcount;
    }
    int uniqueConsonants(String str) 
    {
        byte Ccount=0;    
        char arr2[]={'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
        str=str.toLowerCase();
        for(char d: arr2)
        {
            if(str.contains(""+d)) 
            {
                Ccount++;
            }
        }
        return Ccount++;
    }
}
public class Java18
{
	public static void main(String[] args) 
	{
	    Alphabets a=new Alphabets();
		System.out.println(a.uniqueVowel("abacab"));
		System.out.println(a.uniqueConsonants("abacab"));
	}
}