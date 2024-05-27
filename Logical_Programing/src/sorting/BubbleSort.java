package sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 10, 50, 25, 1, 6, 80 };
		BubbleSort bs = new BubbleSort();
		bs.enhanceSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public void enhanceSort(int[] num) {
		int i = 0;
		boolean flag = true;

		while (flag) {
			flag = false;
			i++;
			for (int j = 0; j < num.length - i; j++) {
				if (num[j] > num[j + 1]) {
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
					flag = true;
				}
			}
		}
	}

	public void sort(int[] num) {
		for (int i = 1; i < num.length; i++) {
			for (int j = 0; j < num.length - i; j++) {
				if (num[j] > num[j + 1]) {
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
	}

}
