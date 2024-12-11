package section10;

public class Customer extends Person {
	int memberID;
	
	Customer(String name, int age, int memberID) {
		super(name, age);	//super메서드를 통해서 부모 생성자에 매개변수 전달

		this.memberID = memberID;	
	}
	
	void enter() {
		System.out.println("회원번호 : " + memberID
							+ " (" + name + ", " + age + "세) 님 입장하셨습니다.");	//name.age는 부모 클래스에게 상속받은 필드
	}
	
}
