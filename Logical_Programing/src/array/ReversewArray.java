package array;

import java.util.Scanner;

public class ReversewArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int arr1[] = new int[n];
		System.out.println("Enter the elements of Array of size "+n);
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Original Array");
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		int reverseArr[] = new int[n];
		
		for(int i=0, j=arr1.length; i< arr1.length; i++, j--) {
			 reverseArr[j-1] = arr1[i];
		}
		
		System.out.println("Reversed Array");
		for(int i=0; i<reverseArr.length; i++) {
			System.out.println(reverseArr[i]);
		}
		
		sc.close();
	}
}
