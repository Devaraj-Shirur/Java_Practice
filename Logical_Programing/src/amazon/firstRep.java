package amazon;

import java.util.Scanner;

public class firstRep {
	
	public static char rep(String s) {
		
		for(int i = 0; i<s.length(); i++) {
			int count = 0;
			
			for(int j = 0; j<s.length(); j++) {
				if(s.charAt(i) == s.charAt(j) && i!=j) {
					count++;
				}
			}
			if(count==0) {
				return s.charAt(i);
			}
		}
		
		return '_';
	}
	
	
	public static char rep2(String s) {
		
		for(int i=0; i<s.length(); i++) {
			if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
				return s.charAt(i);
			}
		}
		
		return '_';
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(rep2(s));
		sc.close();
	}
}
