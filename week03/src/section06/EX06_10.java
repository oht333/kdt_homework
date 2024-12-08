package section06;

import java.util.Arrays;

public class EX06_10 {
	public static void main(String[] args) {
		int[] arr01 = {1,2,3};
		
		int[] arr02 = arr01;	//얕은 복사 : 주소값을 복사한 것이기 때문에 한쪽이 수정되면 다른 한쪽도 수정된다
		
		System.out.println("arr01 배열 : " + Arrays.toString(arr01));
		
		arr02[1] = 10;
		
		System.out.println("arr02 배열 : " + Arrays.toString(arr01));
		System.out.println("arr01 배열 : " + Arrays.toString(arr02));
		
	}
}
