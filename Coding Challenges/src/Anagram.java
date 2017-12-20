
//Given two strings check if the the two strings are anagrams or not
import java.util.*;
public class Anagram {

	public static void main(String args[])
	{
		Scanner k = new Scanner(System.in);
		System.out.println("Enter 1st String");
		String first = k.nextLine();
		System.out.println("Enter 2nd String");
		String second =  k.nextLine();
		boolean result = checkAnagram(first,second);
		System.out.println("---->"+result);
		
	}
	
	/**
	 * @param first
	 * @param second
	 * @return
	 */
	static boolean checkAnagram(String first, String second)
	{
		
		int[] word = new int[256];
		if(first.length()!=second.length())
			return false;
		
		for(int i = 0; i<first.length();i++)
		{
			word[(int)first.charAt(i)]++;
			word[(int)second.charAt(i)]--;
		}
		
		for(int i = 0; i<256;i++)
		{
		if(word[i]!=0)
			{
				return false;
			}
		}
		return true;
	}
}

/**
Test Case 1:
Enter 1st String
Hello
Enter 2nd String
elloH
---->true

Test Case 2:
Enter 1st String
care
Enter 2nd String
rare
---->false

**/
