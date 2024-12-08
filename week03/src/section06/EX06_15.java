package section06;

public class EX06_15 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
		int count = 1;
		
		for(int i=0; i<5; i++) {	//1부터 25까지 차례대로 배열의 값에 저장
			for(int j=0; j<5; j++) {
				arr[i][j] = count++;
			}
		}
		
		for(int i=0; i<5; i++) {	//배열 출력
			for(int j=0; j<5; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
