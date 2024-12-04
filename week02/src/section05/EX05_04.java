package section05;

public class EX05_04 {

	public static void main(String[] args) {
		for(int i=0; i<7; i++) {	//7개의 행
			for(int j=0; j<7-i; j++) {		//공백이 하나씰 줄어들게 된다 (println : x)
				System.out.print(" ");
			}
			for(int k=0; k<(2*i)+1; k++) {	//별 모양은 홀수로 나타난다 (println : x)
				System.out.print("*");
			}
			
			System.out.println();	//줄을 바꾼다
		}
	}

}
