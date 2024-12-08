package section06;

import java.util.Scanner;

public class EX06_16 {
	public static void main(String[] args) {
		int[][] lotto = {{2,6,11,33,42,44}, {1,6,17,22,24,33}, {7,16,24,33,42,44}, {11,27,32,34,43,46}, {6,17,22,24,33,41}};
		
		Scanner scan = new Scanner(System.in);
		String myNum = "";
		System.out.println("당첨 숫자 6개를 연속으로 입력해주세요. >>");
		myNum = scan.next();
		
		boolean isWin = false;	//당첨 여부를 나타내는 변수
		
		for(int i=0; i<lotto.length; i++) {
			String lottoNumber = "";
			for(int j=0; j<lotto[i].length; j++) {	//한 행의 번호를 더해서 하나의 숫자로 만든다
				lottoNumber += lotto[i][j];
			}
			
			if(myNum.equals(lottoNumber)) {		//번호가 같으면 당첨 여부가 true로 변환
				isWin = true;
				break;
			}
		}
		
		if(isWin) {
			System.out.println(myNum + " 번호 당첨!! ");
		} else {
			System.out.println(myNum + " 번호는 당첨되지 못했습니다.");
		}
		scan.close();
	}
}
