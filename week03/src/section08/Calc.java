package section08;

public class Calc {
	void sum(int num1, int num2) {
		System.out.println("두 수의 합은 " + (num1 + num2) + "입니다.");
	}
	
	public static void main(String[] args) {
		Calc calc = new Calc();
		calc.sum(5, 3);
		calc.sum(10, 7);
	}
}
