package section06;

import java.util.Arrays;

public class EX06_11 {
	public static void main(String[] args) {
		int[] card = {1,6,4,5,3,2};
		int[] newCard = new int[card.length];	//card와 똑같은 행의 길이로 초기화
		
		for(int i=0; i<card.length; i++) {		//card 각 행의 값을 똑같이 대입
			newCard[i] = card[i];
		}
		
		System.out.println("card 배열 : " + Arrays.toString(card));
		System.out.println("newCard 배열 : " + Arrays.toString(newCard));
	}
}
