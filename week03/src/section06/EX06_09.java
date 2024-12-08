package section06;

import java.util.Arrays;
import java.util.Comparator;

public class EX06_09 {
	public static void main(String[] args) {
		Integer[] arr = {1,6,2,3,10,7,4,5,8,9};			//내림차순으로 정렬해주는 매서드를 사용할때 int[] => Integer[]
		
		System.out.println("정렬 전 배열 : " + Arrays.toString(arr));
		
		Arrays.sort(arr, Comparator.reverseOrder());	//Arrays.sort() : 배열을 내림차순으로 정렬해주는 매서드
		System.out.println("정렬 후 배열 : " + Arrays.toString(arr));
	}
}
