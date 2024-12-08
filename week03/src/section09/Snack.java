package section09;

public class Snack {
	int price;
	
	Snack() {
		
	}
	
	Snack(int p) {		// 직접 선언한 생성자 (선언을 안할 시 기본생성자가 자동으로 생성된다)
		price = p;		// 매개변수로 받은 값을 필드 price에 대입
	}
	
	void info() {
		System.out.println("과자의 가격은 " + price + "원입니다.");
	}
}
