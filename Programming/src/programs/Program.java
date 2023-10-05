package programs;

class Program {
	public static void main(String[] args) {
		int arr[] = { 3, 8, 14, 12, 10, 7, 4 };
		int sum1 = 0, sum2 = 0;
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j] < arr[j + 1]) {
					sum1 = sum1 + arr[j];
				} else if (arr[j] > arr[j + 1]) {
					sum2 = sum2 + arr[j];
				}
		}
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum1 * sum2);
	}
}
