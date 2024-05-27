package strings;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.nextLine();
		String s2 = "";

		int strlength = s.length();

		for (int i = strlength - 1; i >= 0; i--) {
			s2 = s2 + s.charAt(i);
		}

		System.out.println(s2);
		sc.close();
	}
}
