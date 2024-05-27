package strings;

public class StringCharactersRepeatation {

	public static void main(String[] args) {
		String str = "a1s3c4b2";
		String result = stringCompression(str);
		System.out.println(result);
	}
	
	public static String stringCompression(String s) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<s.length(); i +=2) {
			
			char c = s.charAt(i);
			int count = Character.getNumericValue(s.charAt(i+1));
			while(count>0) {
				sb.append(c);
				count--;
			}
		}
		
		return sb.toString();
	}
}
