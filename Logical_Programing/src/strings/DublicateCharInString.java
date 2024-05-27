package strings;

public class DublicateCharInString {

	public static void main(String[] args) {
		
		String value = "My Name is Devaraj Shirur";
		
		//Convert string to char array
		
		char String[] = value.toCharArray();
		
		System.out.println("Dublicate Characters are");
		
		for(int i=0; i<String.length; i++) {
			int count = 1;
			int rep = 1;
			
			for(int j = i+1; j<String.length; j++) {
				if(String[i]==String[j] && String[i]!=' ') {
					count++;
					rep++;
					String[j] = '0';
				}
			}
			
			if(count > 1 && String[i] != '0') {
				//System.out.println(String[i]);
				System.out.println(String[i]+" - Rep = "+rep);
			}
		}
	}
}
