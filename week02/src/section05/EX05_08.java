package section05;

import java.util.Scanner;

public class EX05_08 {

	public static void main(String[] args) {
		int magicNumber = (int)(Math.random() * 50) + 1;	//1~50 숫자중 랜덤으로 저장
		Scanner scan = new Scanner(System.in);
		boolean isMatched = false;
		
		for(int i=0; i<10; i++) {	//총 10번의 기회
			System.out.println("찾는 숫자를 입력 >> ");
			int guess = scan.nextInt();	// 찾을 숫자 입력
			
			if(guess == magicNumber) {	// 숫자를 맞추면
				System.out.println((i+1) + "번째에 맞췄습니다!");
				isMatched = true;
				break;	//정답을 맞췄으면 종료
			} else if(guess > magicNumber) {	//적은 숫자가 더 크면
				System.out.println("맞춰야할 숫자가 더 작습니다.");
			} else if(guess < magicNumber) {	//적은 숫자가 더 작으면
				System.out.println("맞춰야할 숫자가 더 큽니다.");
			}
		}
		
		if(!isMatched) {	//10번의 기회를 날리면 false값이 되면서 밑의 문구 출력
			System.out.println("정답을 맞추지 못했습니다.");
		}
	}

}
