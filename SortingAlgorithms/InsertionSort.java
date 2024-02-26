public class InsertionSort
{
	void insertionSort(int[] A)
	{

		int n = A.length;

		for (int i=1; i<n; i++) // The reason we started with i=1 is important to understand.
					// In insertion sort, we always assume that the first element in the array is already sorted.
					// So, it's like a sorted list and we are adding next elements to that list. After every
					// addition left side of the list will be sorted this way, till the last element, then the
					// all list is sorted.
		{
			int j = i - 1;
			int x = A[i];

			while (j > -1 && A[j] > x)
			{
				A[j+1] = A[j];
				j--;
			}
			A[j + 1] = x;
		}
	}

	public static void main(String[] args)
	{
		int arr[] = {3, 4, 1, 0, -2, 5, 11, 321, 4, 9, 9};

		InsertionSort insSort = new InsertionSort();

		insSort.insertionSort(arr);

		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
