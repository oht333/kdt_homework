package section10.access1;

public class PublicA {
	public int a;

//	public PublicA(int a) {
//		this.a = a;
//	}
	
	private PublicA(int a) {
		this.a = a;
	}
	
	public void printA() {
		System.out.println("PublicA 클래스의 printA() 매서드입니다.");
	}
	
	
}
