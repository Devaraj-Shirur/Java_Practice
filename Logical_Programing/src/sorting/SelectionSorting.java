package sorting;

public class SelectionSorting {

	public static void main(String[] args) {
		int[] arr = { 1, 10, 5, 2, 22, 100, 3, 500 };
		SelectionSorting ss = new SelectionSorting();
		ss.selectionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public void selectionSort(int[] num) {
		int temp, size = num.length, min;

		for (int i = 0; i < num.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < size; j++) {
				if (num[j] < num[min]) {
					min = j;
				}
			}

			temp = num[i];
			num[i] = num[min];
			num[min] = temp;
		}
	}

}
