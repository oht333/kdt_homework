package section08;

public class Jogger {

	void run() {
		System.out.println("run run run!");
	}
	
	public static void main(String[] args) {
		Jogger jogger = new Jogger();		//Jogger클래스의 객체를 생성
		jogger.run();						//클래스명.매서드명(); 을 통해 매서드 불러오기
	}

}
