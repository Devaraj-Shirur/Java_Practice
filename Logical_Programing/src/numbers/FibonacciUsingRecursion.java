package numbers;

import java.util.Scanner;

public class FibonacciUsingRecursion {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		for(int i = 0; i<num; i++) {
			System.out.print(fibonacci(i)+" ");
		}
		sc.close();
	}
	
	private static int fibonacci(int num) {
		if((num == 0) || (num == 1)){
			return num;
		}else {
			return fibonacci(num-1)+fibonacci(num-2);
		}
	}
}
