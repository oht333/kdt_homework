package section06;

public class EX06_05 {
	public static void main(String[] args) {
		char[] cards = {'1', 'L', 'O', '2', 'V', '3', 'E'};
		String myWord = "";
		
		for(int i=0; i<cards.length; i++) {
			int word = cards[i];
			
			if((word >= 65 && word <= 90) || (word >=97 && word <= 122)) {		//A~Z 또는  a~z 사이(아스키코드)
				myWord += (char)word;
			}
		}
		
		System.out.println("단어 : " + myWord);	//배열 중 영어만 정렬해서 출력	
	}
}
