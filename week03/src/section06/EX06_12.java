package section06;

import java.util.Arrays;

public class EX06_12 {
	public static void main(String[] args) {
		int[] card = {3,1,4,5,10};
		
		//배열의 깊은 복사 - Arrays.copyOf(배열, 복사범위)
		int[] newCard = Arrays.copyOf(card, card.length);
		
		System.out.println("card배열 : " + Arrays.toString(card));
		
		card[1] = 10;
		
		System.out.println("card배열 : " + Arrays.toString(card));			//얕은복사
		System.out.println("newCard배열 : " + Arrays.toString(newCard));		//깊은복사
		
	}
}
