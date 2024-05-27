package numbers;

import java.util.Scanner;

public class NivenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		int digit, sum = 0, temp = num;
		while(num!=0) {
			digit = num%10;
			sum = sum+digit;
			num = num/10;
		}
		
		if(temp%sum == 0) {
			System.out.println("The Number is a Nievn Number");
		}else {
			System.out.println("The Number is Not a Niven Number");
		}
		
		sc.close();
	}
}
