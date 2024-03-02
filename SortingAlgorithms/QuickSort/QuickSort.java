public class QuickSort
{
	void Swap(int A[], int i, int j)
	{
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}

	int partition(int[] A, int low, int high)
	{
		int pivot = A[low];
		int i = low;
		int j = high;

		do
		{
			do{i++;} 
			while(A[i] <= pivot);
			
			do{j--;} 
			while(A[j] > pivot);

			if (i<j) 
			{
				Swap(A, i, j);
			}
		}
		while (i<j);

		Swap(A, low, j);
		return j;
	}

	void quickSort(int A[], int low, int high)
	{
		int j;

		if (low < high)
		{
			j = partition(A, low, high);

			quickSort(A, low, j);
			quickSort(A, j+1, high);
		}
	}

	public static void main(String[] args)
	{
		int arr[] = {11, 1, 3, 5, 34, -23, 2, 0, Integer.MAX_VALUE};


		QuickSort qs = new QuickSort();

			
		qs.quickSort(arr, 0, 8);

		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
