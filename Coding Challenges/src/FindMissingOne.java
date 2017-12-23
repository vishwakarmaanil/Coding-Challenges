/**
 * Given an array of n-1 integers between 1 to n find the missing number
 * 
 * Input Constriant:
 * all numbers in increasing orders.
 * only one missing number is allowed
 * example { 2,3,4,5,7,8,9} --> Missing is 6
 */
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
		System.out.println();
		System.out.println("Answer--->"+result);
	}
	
	static int findMissing(int[] array)
	{
		 
		 
		
		for(int i=0;i<array.length;i++)
		{
			
			if( array[i]%2 == 1)
			{
				if(array[i+1]%2!=0)
					
					return array[i+1]-1;
			}
			else 
				if (array[i]%2 == 0)
				{
					if(array[i+1]%2!=1)
						
						return array[i+1]-1;
				}
				else
					continue;
			}
		return -1;
}
	/**
	 * Alternate Solution:
	 
	 	 private static int findMissing(int array[]) {
        int size = array.length;
        int totalsum = (size+1)*(size+2)/2;
        int sum=0;
        for(int i=0;i<size;i++)
            sum += array[i];
        return totalsumSum - sum;
    }
	 */
}

/**
 * Test Case 1: 
Enter number of elements
11
1
2
3
5
6
7
8
9
10
11
12

Answer--->4
 * 
Test Case 2:

 * */
