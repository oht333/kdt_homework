package section04;

import java.util.Scanner;

public class EX04_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 숫자를 입력하세요. (1~5)");
		
		int num = sc.nextInt();
		switch(num) {
		case 5:
			System.out.println("5를 입력하였습니다.");	//5의 경우
			break;
		case 4:
			System.out.println("4를 입력하였습니다.");	//4의 경우
			break;
		case 3:
			System.out.println("3를 입력하였습니다.");	//3의 경우
			break;
		case 2:
			System.out.println("2를 입력하였습니다.");	//2의 경우
			break;
		case 1:
			System.out.println("1를 입력하였습니다.");	//1의 경우
			break;
		default:
			System.out.println("1~5까지의 숫자를 입력하세요.");		//case외 다른 숫자를 입력했으므로 다시 입력하라는 문구 출력
		}
	}

}
