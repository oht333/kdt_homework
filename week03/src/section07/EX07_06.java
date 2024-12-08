package section07;

public class EX07_06 {
	public static void main(String[] args) {
		Car c = new Car();	//클래스를 이용해서 객체 생성
		System.out.println("Wheel의 개수는 " + c.wheel + "개입니다.");	//필드값 출력
		
		c.wheel = 5;	//c객체의 wheel값을 5로 변경
		System.out.println("Wheel의 개수는 " + c.wheel + "개입니다.");	//변경 된 필드값 출력
	}
}
