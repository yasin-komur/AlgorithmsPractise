public class BubbleSort
{
	void bubbleSort(int A[])
	{
		int n = A.length;
		boolean flag = false;

		for (int i=0; i<n-1; i++)
		{
			for (int j=0; j<n-1-i; j++)
			{
				if (A[j] > A[j+1])
				{
					Swap(A, j, j+1);
				}
				flag = true;
			}

			if (!flag)
			{
				break;
			}
		}

	}


	void Swap(int A[], int x, int y)
	{
		int temp = A[x];
		A[x] = A[y];
		A[y] = temp;
	}

	public static void main(String[] args)
	{
		BubbleSort bs = new BubbleSort();

		int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};

		bs.bubbleSort(arr);

		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
