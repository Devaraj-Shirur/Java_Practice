package numbers;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter te Number");
		int num = sc.nextInt();
		System.out.println(ArmstronNum(num));
		
		sc.close();
	}
	
	private static boolean ArmstronNum(int n) {
		int digit, cube, sumOfcubes = 0;
		int temp = n;
		while(n!=0) {
			digit = n%10;
			cube = digit*digit*digit;
			sumOfcubes = sumOfcubes+cube;
			n = n/10;
		}
		
		return temp == sumOfcubes;
	}
}
