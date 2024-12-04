package section04;

import java.util.Scanner;

public class EX04_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요.");
		
		int age = sc.nextInt();
		
		if(age > 19) {
			System.out.println("성인입니다.");	//나이를 입력후 19보다 큰 숫자면 "성인입니다." 출력
		} else {
			System.out.println("미성년자입니다."); //나이를 입력후 19보다 작은 숫자면 "미성년자입니다." 출력
		}
	}

}
