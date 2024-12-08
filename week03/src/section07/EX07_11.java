package section07;

public class EX07_11 {
	public static void main(String[] args) {
		Family father = new Family();	//각각의 객체를 생성
		Family son = new Family();		
		
		father.address = "인천";
		System.out.println(son.address);
	}
}
