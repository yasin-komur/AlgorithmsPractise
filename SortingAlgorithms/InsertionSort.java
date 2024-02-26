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
			int j = i - 1; // Helper value to check values on the left. When a new value will be added, this 
				       // j will go through the left side of the list and compare the values with x.

			int x = A[i]; // This value is important the store. Because when we shift the values. we also occupy x's
				      // place. After shifting to add the new value at the beginning of the list as the min value
				      // in the sorted list, we have to store it to use afterwards. 
				      // Shifted value will be on its place.

			while (j > -1 && A[j] > x)
			{
				A[j+1] = A[j];
				j--;
			}
			A[j + 1] = x; // Add the minimum to the beginning of the array. We said j+1 because, j at the end will be -1.
				      // And we want to add the value to index 0.
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
