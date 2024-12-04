package section08;

public class MidTerm {
	public int score(int[] scores) {		//각 배열값들의 총점
		int result = 0;
		for(int i=0; i<scores.length; i++) {
			result += scores[i];
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		int[] studentA = {97, 53};		//A학생의 점수현황
		int[] studentB = {95, 66};		//B학생의 점수현황
		
		MidTerm mid = new MidTerm();	//MidTerm 객체 생성
		int sumA = mid.score(studentA);	//A학생의 총점
		int sumB = mid.score(studentB);	//B학생의 총점
		
		
		if(sumA > sumB) {				//if문으로 총점을 비교해서 값 출력
			System.out.println("A학생의 중간고사 총점이 더 높습니다.");
		} else if(sumA < sumB) {
			System.out.println("B학생의 중간고사 총점이 더 높습니다.");
		} else {	//sumA == sumB
			System.out.println("두 학생의 중간고사 총점이 같습니다.");
		}
	}

}
