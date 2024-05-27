package searching;

import java.util.Arrays;

public class RecursiveBinarySearch {

	public static void main(String[] args) {
		int[] arr = {100, 200, 10, 4, 9, 0, 12};
		Arrays.sort(arr);
		System.out.println("Sorted Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int index = RecursiveBinary(arr, arr.length-1, 0, 9);
		
		if(index == -1) {
			System.out.println("The Number is not in the Array");
		}else {
			System.out.println("Number is at index : "+index);
		}
	}

	private static int RecursiveBinary(int[] arr, int high, int low, int num) {
		
		while(high>=low) {
			int mid = (high+low)/2;
			
			if(num == arr[mid]) {
				return mid;
			}
			
			if(num<arr[mid]) {
				return RecursiveBinary(arr, mid-1, low, num);
			}else {
				return RecursiveBinary(arr, high, mid+1, num);
			}
		}
		
		return  -1;
	}
}
