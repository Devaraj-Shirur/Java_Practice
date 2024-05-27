package numbers;

import java.util.Scanner;

public class HCFofTwoNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number 1");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the Number 2");
		int num2 = sc.nextInt();
		
		int hcf = 0;
		
		for(int i=1; i<=num1 || i<=num2; i++) {
			
			if(num1%i==0 && num2%i==0) {
				hcf = i;
			}
			
		}
		
		System.out.println("HCF = "+hcf);
		
		sc.close();
	}
}
