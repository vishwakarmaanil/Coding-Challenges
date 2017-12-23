import java.util.*;
public class FindMissingOne {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner k = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n = k.nextInt();
		
		int array[] = new int [n];
		
		for(int i=0;i<n;i++)
		{
			array[i]= k.nextInt();
			
		}
		
		int result = findMissing(array);
		
	}
	
	static int findMissing(int[] array)
	{
		
		return -1;
	}
	

}
