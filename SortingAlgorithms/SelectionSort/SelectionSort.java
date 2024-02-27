public class SelectionSort
{
	void selectionSort(int A[])
	{
		int n = A.length;

		for (int i=0; i<n; i++) // This is for passes of the array.
		{
			
			int k = i;
			int j;

			for (j=i+1; j<n; j++) // This line is important. We basically assign j to i+1 to compare the rest of the array.
					    // We could also say -> j=i. But, with saying j=i+1, we avoided a comparison with the current
					    // i value. 
			{
				if (A[j] < A[k])
				{
					k = j;
				}
			}

			Swap(A, i, k);
		}
	}

	void Swap(int[] A, int i, int k)
	{
		int temp = A[i];
		A[i] = A[k];
		A[k] = temp;
	}

	public static void main(String[] args)
	{
		int arr[] = {4, 7, 12, -5, 4, 0, 1, 19};

		SelectionSort ss = new SelectionSort();

		ss.selectionSort(arr);

		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
