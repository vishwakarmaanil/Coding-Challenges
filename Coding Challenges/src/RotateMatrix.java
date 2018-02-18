
public class RotateMatrix
{
	public static void main(String args[])
	{
		int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		
		int [][] rotate = rotate(matrix);
		
	
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				System.out.print( rotate[i][j] + " ");
			}
			System.out.println();
			System.out.println();
		}

	}

	static int[][] rotate(int[][] matrix)
	{
		int n = matrix.length;
		for (int layer = 0; layer < n / 2; layer++)
		{
			int first = layer;
			int last = n - 1 - layer;

			for (int i = first; i < last; i++)
			{

				int offset = i - first;
				
				int top  = matrix [last-offset][first];
				
				matrix [last-offset][first] = matrix [last][last-offset];
				
				matrix [last][last-offset] = matrix [i][last];
				
				matrix [i][last] = top;
			}

		}
		return matrix;
	}

}
