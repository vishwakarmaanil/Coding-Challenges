import java.util.Scanner;

/**
 * Implement an algorithm to determine if a String has all unique characters.
 * @author Anil
 *
 */
public class UniqueCharacters 
	{
		public static void main(String args[]) 
		{
			Scanner k = new Scanner(System.in);
			System.out.println("Enter the String");
			String s = k.nextLine();
			s.replaceAll(" ", "");
			boolean result = isUnique(s);
			System.out.println("--->"+result);
		}
	static boolean isUnique(String s) 	
	{
		
		int asciiArray[] = new int[128];
		for(int i = 0 ; i < s.length(); i++) 
		{
			asciiArray[s.charAt(i)]++;
		}
		for(int j= 0;j<128;j++) 
		{
			if(asciiArray[j]==2) 
			{
				return false;
			}
		}
		return true;	
	}
}
/**
Case 1:
Enter the String
hell
--->false
		
Case 2:
Enter the String
Anil
--->true			
 */