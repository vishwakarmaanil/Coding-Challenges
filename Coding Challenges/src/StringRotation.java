import java.util.Scanner;

public class StringRotation
{
	public static void main(String args[])
	{
		Scanner k = new Scanner(System.in);
		System.out.println("Enter 1st String");
		String first = k.nextLine();
		System.out.println("Enter 2nd String");
		String second = k.nextLine();
		if(first.length()!=second.length())
			System.out.println("---->false");
		else
		{
			first+=first;
			boolean result = isSubstring(first, second);
			System.out.println("---->" + result);
		}

	}
	

	private static boolean isSubstring(String first, String second)
	{
		if(first.contains(second))
			return true;
		else
			return false;
	}

}
