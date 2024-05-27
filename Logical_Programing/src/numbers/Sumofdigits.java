package numbers;

import java.util.Scanner;

public class Sumofdigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int digit, num = sc.nextInt(), sum = 0;
		
		while(num!=0) {
			digit = num%10;
			sum = sum + digit;
			num = num/10;
		}
		System.out.println("Sum of digits = "+sum);
		sc.close();
	}
}
