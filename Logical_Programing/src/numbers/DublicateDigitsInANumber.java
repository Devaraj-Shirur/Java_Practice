package numbers;

public class DublicateDigitsInANumber {

	public static void main(String[] args) {
		
		int Num = 1122334455;
		String str_num = Integer.toString(Num);
		
		char[] arrNum = str_num.toCharArray();
		System.out.println("Dublicte Digits are ");
		for(int i=0; i<arrNum.length; i++) {
			int count = 1;
			for(int j=i+1; j<arrNum.length; j++) {
				if(arrNum[i] == arrNum[j]) {
					count++;
					arrNum[j] = 'a';
				} 
			}
			
			if(count>1 && arrNum[i]!='a') {
				System.out.println(arrNum[i]+" - Rep = "+count);
			}
		}
		
	}
}
