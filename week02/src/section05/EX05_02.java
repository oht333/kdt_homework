package section05;

public class EX05_02 {

	public static void main(String[] args) {
		int sum = 0;	//합을 저장할 변수
		
		//1부터 100까지 반복
		for(int i = 1; i <= 100; i++) {
			if(i%2==0) {	//2로 나누어 떨어지면 짝수
				sum+= i;	// 짝수의 합을 더한다.
			}
		}
		
		System.out.println("합 : " + sum);
	}

}
