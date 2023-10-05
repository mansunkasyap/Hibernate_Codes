package programs;

//T.C => O(1)
//S.C => O(n)

public class MergeSort {
	static void partition(int[] arr, int start, int end) {
		if (end > start) {
			int mid = (start + end) / 2;
			partition(arr, mid, start);
			partition(arr, mid + 1, end);
			mergeSort(arr, start, mid, end);
		}
	}

	static void mergeSort(int[] arr, int start, int end, int mid) {
		int RTA[] = new int[mid - start + 2];
		int LTA[] = new int[end - mid + 1];
		// Assigning the values
		for (int i = 0; i < mid - start + 1; i++) {
			RTA[i] = arr[i];
		}
		for (int i = 0; i < end - mid; i++) {
			LTA[i] = arr[mid + i + 1];
		}
		RTA[end - 2] = Integer.MAX_VALUE;
		LTA[end - 2] = Integer.MAX_VALUE;
		int i = 0, j = 0;
		for (int k = start; k < end; k++) {
			if (LTA[i] < RTA[i]) {
				arr[i] = LTA[i];
				i++;
			} else {
				arr[i] = RTA[j];
				j++;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 12, 1, 34, 2, 5, 7 };
		partition(arr, 0, 5);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}
