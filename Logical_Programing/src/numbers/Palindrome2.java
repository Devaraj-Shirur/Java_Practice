package numbers;

import java.util.Scanner;

public class Palindrome2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		int[] binaryNumber = new int[10];
		int i = 0;
		while(num!=0) {
			binaryNumber[i] = num%2;
			num = num/2 ;
			i++;
		}
		
		for(int j = i-1; j>=0; j--) {
			System.out.print(binaryNumber[j]);
		}
		
		sc.close();
	}
}
