package section04;

import java.util.Scanner;

public class EX04_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();
		if(age > 19) {
			System.out.println("성인입니다.");		//19보다 크면 출력
		} else if(age > 13) {
			System.out.println("청소년입니다.");	//13보다 크고 19보다 작으면 출력	
		} else if(age > 6) {
			System.out.println("어린이입니다.");	//6보다 크고 13보다 작으면 출력
		} else {
			System.out.println("유아입니다.");		//6보다 작으면 출력
		}
	}
}
