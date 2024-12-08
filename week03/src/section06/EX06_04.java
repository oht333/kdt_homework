package section06;

public class EX06_04 {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = (int)(Math.random() * 30) + 1;		//랜덤함수를 이용해 임의의 값을 입력
		}
		
		int sum = 0;
		for(int i=0; i<numbers.length; i++) {
			
			if(numbers[i] % 2 == 0) {	//배열 안의 짝수행의 값만 합쳐서 sum에 저장
				sum += numbers[i];
			}
		}
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i] + " ");		//랜덤값 출력
		}
		
		System.out.println();
		System.out.println("배열의 짝수들의 합 : " + sum);
	}
}
