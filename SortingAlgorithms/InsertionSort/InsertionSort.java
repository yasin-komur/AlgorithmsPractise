public class InsertionSort
{
	void insertionSort(int[] A)
	{

		int n = A.length;
		
		for (int i=1; i<n; i++)
		{
			int x = A[i];

			int j = i - 1;

			while (j > -1 && A[j] > x)
			{
				Swap(A, j, j+1);
				j--;
			}

			A[j+1] = x;
		}
	}

	void Swap(int A[], int i, int j)
	{
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}


	public static void main(String[] args)
	{
		int arr[] = {6, 3, 1, 9, 10, -4};

		InsertionSort theSort = new InsertionSort();

		theSort.insertionSort(arr);

		for (int i=0; i< arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}


