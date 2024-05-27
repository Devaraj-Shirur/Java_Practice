package numbers;

import java.util.Scanner;

public class Leapyear {
	
	public static void main(String[] args) {
		System.out.println("Enter a Year");
		try(Scanner sc = new Scanner(System.in);){
			int year = sc.nextInt();
			if((year%4 == 0 && year%100 !=100) || year%400 == 0) {
				System.out.println("The year "+year+" is a Leap Year");
			}else {
				System.out.println("The year "+year+" is not a Leap Year");
			}
		}
		
	}
	
}
