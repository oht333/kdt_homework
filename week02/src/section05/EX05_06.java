package section05;

public class EX05_06 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		do {	//do문을 한번 무조건 실행하고 난 후 while문의 조건이 false가 될 때까지 반복
			sum += i;
			i++;
		} while(i <= 10);
		
		System.out.println("합 : " + sum);
	}

}
