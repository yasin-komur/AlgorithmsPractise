public class BubbleSort 
{
	void bubbleSort(int[] A)
	{
		
		boolean flag = false; // This flag is added to make the bubble sort "adaptive". 
				      // Since bubble sort is not adaptive by its original design, this is the way to make it.

		int n = A.length; // This will be useful in the loops.

		for (int i=0; i<n-1; i++)
		{
			for (int j=0; j<n-1-i; j++) // This line is very important. We could also say n-1 only. But making it n-1-i avoids unnecessary loops.
			{
				if (A[j] > A[j+1])
				{
					Swap(A, j, j+1);
					flag = true;
				}
			}

			if (!flag) // If flag is still false, there has been no change in the first pass, meaning that the list 
				   // is already sorted. The time taken is O(n) thanks to making it adaptive.
			{
				break; // If the list is already sorted, then break the loop not to do unnecessary comparisons.
			}
		}
	}

	void Swap(int A[], int i, int j) // The function Swap is created to swap values after comparisons.
	{
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}

	public static void main(String[] args)
	{

		int arr[] = {4, 3, 2, 9, 10, -2, 0};

		BubbleSort bs = new BubbleSort();

		bs.bubbleSort(arr);

		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
