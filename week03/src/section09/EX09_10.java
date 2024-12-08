package section09;

public class EX09_10 {
	public static void main(String[] args) {
		Phone p1 = new Phone("갤럭시", 1, "흰색");
		Phone p2 = new Phone("아이폰", 2);	//생성자가 있으므로 error가 나지 않는다
		
		p1.phoneInfo();
		p2.phoneInfo();
	}
	
	
}
