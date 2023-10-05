package sorting;

import java.util.Arrays;

public class Bubble {
	static void bubbleSort(int [] a) {
		for(int i=0; i<a.length; i++) {//O(n)
			for(int j=0; j<a.length-i-1; j++) {//O(n)
				if(a[j] > a[j+1]) {
					int temp = a[j];//O(1)
					a[j] = a[j+1];//O(1)
					a[j+1] = temp;//O(1)
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
	public static void main(String[] args) {
		int arr[] = {5, 1, 7, 9, 2};
		bubbleSort(arr);//TC => O(n*n), Sc=>O(n)
	}
}
