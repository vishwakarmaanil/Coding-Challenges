import java.util.Scanner;

/**
 * Given a String, write a function to check if its a permutation of a palindrome.
 * @author Anil
 *
 */
public class PalindromePermutation
{
	public static void main(String args[]) 
	{
		Scanner k = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = k.nextLine();
		s.replaceAll(" ", "");
		boolean result = isPalindromePermutation(s);
		System.out.println("--->"+result);
	}
	static boolean isPalindromePermutation(String s)
	{
		int asciiArray[] = new int[128];
		int count =0;
//		if(s.isEmpty())
//		{		
//			return true;
//		}
		for(int i = 0; i< s.length();i++)
		{
			if(asciiArray[s.charAt(i)]==1)
				asciiArray[s.charAt(i)]--;
			else
				asciiArray[s.charAt(i)]++;
		}
		
		for(int j=0; j<128 ; j++)
		{
			if(asciiArray[j]==1)
				count ++;
			
		}
		if(count>1)
			return false;
		 
		return true;
	}
}

/**
Case 1:
Enter the String
aabbc
--->true

Case 2:
Enter the String
hello
--->false

**/
