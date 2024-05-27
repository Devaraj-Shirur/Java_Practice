package sorting;

public class InsertionSort {

	public void sort(int[] num) {

		for (int i = 0; i < num.length; ++i) {
			int j = i;

			while (j > 0 && num[j] < num[j - 1]) {
				int temp = num[j];
				num[j] = num[j - 1];
				num[j - 1] = temp;

				j = j - 1;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 11, 4, 2, 8, 10, 2 };
		InsertionSort is = new InsertionSort();
		is.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
