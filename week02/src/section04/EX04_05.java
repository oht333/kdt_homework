package section04;

public class EX04_05 {

	public static void main(String[] args) {
		int a = 4;
		int b = 10;
		int max = 0;
		
		if(a > b) {
			max = a;
		} else {
			max = b;
		}				// 4>10 false 이므로 max = b;
		
		System.out.println(a + "와(과)" + b + " 중에 큰 수는" + max + "입니다.");
	}

}
