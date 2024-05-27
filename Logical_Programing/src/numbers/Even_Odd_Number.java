package numbers;

import java.util.Scanner;

public class Even_Odd_Number {
	
	public static void main(String[] args) {
		System.out.println("Please Enter a Number to check if it is Even or Odd Number");
		try (Scanner sc = new Scanner(System.in);) {
			int num = sc.nextInt();
			if (num < 0) {
				throw new IllegalArgumentException("The Number entered is not valid ");
			} else {
				if (num % 2 == 0) {
					System.out.println("The Entered Number " + num + " is an Even Number");
				} else {
					System.out.println("The Entered Number " + num + " is an Odd Number");
				}
			}
		}

	}
}
