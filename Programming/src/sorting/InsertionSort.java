package sorting;

import java.util.Arrays;

public class InsertionSort {
	static void insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {//O(n)
			int temp = a[i];//O(1)
			int j = i;//O(1)
			while (j > 0 && a[j - 1] > temp) {
				a[j] = a[j - 1];
				j--;
			}
			a[j] = temp;
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		int arr[] = {3, 8, 5, 6};
		insertionSort(arr);//TC => 
	}
}
