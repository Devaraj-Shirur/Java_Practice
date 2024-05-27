package searching;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] arr = {10, 50, 80, 111, 1, 123};
		int index = search(arr, 1234);
		if(index == -1) {
			System.out.println("Num is not in the array");
		}else {
			System.out.println("Num at index : "+index);
		}
		
	}
	
	private static int search(int[] arr, int num) {
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				return i;
			}
			
		}
		return -1;
	}
}
