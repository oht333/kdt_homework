package section05;

public class EX05_07 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 != 0) {
				continue;		//continue이후의 실행 코드를 수행하지 않고 반복문의 처음으로 돌아가 반복문 진행
			}
			sum += i;
		}
		System.out.println("짝수 합 : " + sum);
	}

}
