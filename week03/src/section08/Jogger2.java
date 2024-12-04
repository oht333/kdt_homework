package section08;

public class Jogger2 {

	String name;
	
	void run() {
		System.out.println("run run run!");
	}
	
	void sayName() {
		System.out.println("제 이름은" + name + "입니다.");
	}
	
	public static void main(String[] args) {
		Jogger2 jogger = new Jogger2();
		jogger.name = "김나비";	// Jogger2클래스에서 name 변수에 "김나비" 저장
		jogger.sayName();		// sayName매서드 불러오기
		jogger.run();			// run매서드 불러오기
	}

}
