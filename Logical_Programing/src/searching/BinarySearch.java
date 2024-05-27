package searching;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {100, 200, 10, 4, 9, 0, 12};
		Arrays.sort(arr);
		System.out.println("Sorted Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int index = binary(arr, arr.length-1, 0, 100);
		
		if(index == -1) {
			System.out.println("The Number is not in the Array");
		}else {
			System.out.println("Number is at index : "+index);
		}
	
	}
	
	private static int binary(int[] arr, int high, int low, int num) {
		
		while(low <= high) {
			int mid = (high+low)/2;
			
			if(arr[mid] == num) {
				return mid;
			}
			
			if(num<arr[mid]) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		return -1;
	} 
}
