package sorting;

import java.util.Arrays;

public class Selection {
	static void selectionSort(int []b) {
		for (int i = 0; i < b.length; i++) {
			int minIndex = i;
			for (int j = i+1; j < b.length-1; j++) {
				if(b[j] < b[minIndex])
				{
					minIndex = j;
				}
			}
			if(minIndex != i) {
				int temp = b[i];
				b[i] = b[minIndex];
				b[minIndex] = temp;
			}
		}
		System.out.println(Arrays.toString(b));
	}
	public static void main(String[] args) {
		int arr[] = {9, 3, 2, 1, 64};
		selectionSort(arr);
	}
} 