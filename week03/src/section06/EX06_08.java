package section06;

import java.util.Arrays;

public class EX06_08 {
	public static void main(String[] args) {
		int[] arr = {1,6,2,3,10,7,4,5,8,9};
		
		System.out.println("정렬 전 배열 : " + Arrays.toString(arr));
		
		Arrays.sort(arr);	//Arrays.sort() : 배열을 오름차순으로 정렬해주는 매서드
		System.out.println("정렬 후 배열 : " + Arrays.toString(arr));
	}
}
