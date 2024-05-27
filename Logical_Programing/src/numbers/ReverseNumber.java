package numbers;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int digit = 0, reverse = 0;
		
		while(num != 0) {
			digit = num%10;
			reverse = reverse*10+digit;
			num = num/10;
		}
		System.out.println("Number = "+reverse);
		sc.close();
	}
}
