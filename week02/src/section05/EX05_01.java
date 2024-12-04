package section05;

public class EX05_01 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {	// 1부터 10까지 순차적으로 반복
			sum += i;	//순차적으로 반복되는 값들의 총계
		}
		System.out.println("합 : " + sum);
	}

}
