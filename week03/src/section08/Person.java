package section08;

public class Person {
	void introduce(String name, int age) {
		System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "세입니다.");
	}
	
	void hello() {
		System.out.println("안녕하세요.");
	}
	
	public static void main(String[] args) {
		Person hong = new Person();
		hong.introduce("홍길동", 20);		//인수를 2개 지정
		hong.hello();					//매서드 바로 출력
	}

}
