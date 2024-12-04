package section04;

public class EX04_10 {

	public static void main(String[] args) {
		int num = 7;
		
		switch(num) {
			case 1 : 
				System.out.println("num은 1입니다."); 	// num이 1일때 출력
				break;
			case 7 : 
				System.out.println("num은 7입니다.");	// num이 7일때 출력
				break;
			default : 
				System.out.println("num은 1도 7도 아닙니다.");	// num이 1, 7 둘 다 아닐경우 출력
		}
	}

}
