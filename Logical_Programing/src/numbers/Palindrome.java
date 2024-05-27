package numbers;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt(), digit = 0, reverse = 0;
		int temp = num;
		while(num != 0) {
			digit = num%10;
			reverse = reverse*10 + digit;
			num = num/10;
		}
		if(reverse == temp) {
			System.out.println("The number is a palendrome");
		}else {
			System.out.println("The Number is NOT a Palendrome  " +reverse);
		}
		sc.close();
	}
}
