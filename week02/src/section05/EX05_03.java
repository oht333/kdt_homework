package section05;

public class EX05_03 {

	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) {	//2단부터 9단까지
			for(int j = 1; j <= 9; j++) {	//각 단에서 1부터 9까지 곱하기
				System.out.println(i + "X" + j + "=" + (i * j) + "\t");
			}
			
			System.out.println();	//단 별로 줄바꿈
		}
	}

}
