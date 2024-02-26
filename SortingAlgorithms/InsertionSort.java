public class InsertionSort
{
	void insertionSort(int A[])
	{
		for (int i=1; i<A.length; i++)
		{
			
			int x = A[i];
			int j = i-1;

			while(j>-1 && A[j] > x)
			{
				A[j+1] = A[j];
				j--;
			}
			A[j+1] = x;
		}
	}

	public static void main(String args[])
	{
		InsertionSort isort = new InsertionSort();

		int arr[] = {671, 4, 56, 92, -1, 0, 3, 4, 7, 45, 2342342};

		isort.insertionSort(arr);

		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}


