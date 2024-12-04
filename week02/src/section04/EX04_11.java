package section04;

public class EX04_11 {

	public static void main(String[] args) {
		int num = 7;
		
		switch(num) {
		case 1 : 
			System.out.println("num은 1입니다.");
		case 7 : 
			System.out.println("num은 7입니다.");			// 7이므로 출력
		default : 
			System.out.println("num은 1도 7도 아닙니다.");	// break를 사용하지 않아서 case7출력 후에도 뒤따라오는 모든 case문이 실행되므로 출력
		}
	}

}
