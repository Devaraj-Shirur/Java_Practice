package numbers;

import java.util.Scanner;

public class DigitCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int count = 0, num = sc.nextInt();
		
		while(num!=0) {
			count = count + 1;
			num = num/10;
		}
		System.out.println("Total number of digits = "+count);
		
		sc.close();
	}
}
