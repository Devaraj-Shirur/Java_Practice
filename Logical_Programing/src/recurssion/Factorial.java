package recurssion;

import java.util.Scanner;

public class Factorial {
	
	private static int factorialOfNum(int n) {
		if(n == 1) {
			return 1;
		}else {
			return n*factorialOfNum(n-1);
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		System.out.println(factorialOfNum(num));
		sc.close();
	}
}
