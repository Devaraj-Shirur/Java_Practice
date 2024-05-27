package numbers;

import java.util.Scanner;

public class sumOfEvenAndOddDiits {

	public static void main(String[] args) {
		int EvenSum = 0, OddSum = 0, num, digit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		num = sc.nextInt();
		
		while(num!=0){
			digit = num %10;
			if(digit%2 == 0) {
				EvenSum = EvenSum + digit;
			}else {
				OddSum = OddSum+digit;
			}
			num = num/10;
		}
		System.out.print("Even Sum = "+EvenSum +", Odd Sum = "+OddSum);
		sc.close();
	}
}
