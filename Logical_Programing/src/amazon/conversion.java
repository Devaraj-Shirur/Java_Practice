package amazon;

import java.util.Scanner;

public class conversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		String hexaString = Integer.toHexString(a);
		System.out.println(hexaString);
		
		char asciiChar = (char)a;
		System.out.println(asciiChar);
		
		String binaryString = Integer.toBinaryString(a);
		
		System.out.println(binaryString);
		
		sc.close();
	}
}
