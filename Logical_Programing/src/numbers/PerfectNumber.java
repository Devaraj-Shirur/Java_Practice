package numbers;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		System.out.println(PerfectNum(num));
		sc.close();
	}
	
	private static boolean PerfectNum(int num) {
		int sum = 0;
		for(int i=1; i<num; i++) {
			if(num%i == 0) {
				sum = sum+i;
			}
		}
		return sum == num;
	}
}
