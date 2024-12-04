package section04;

public class EX04_07 {

	public static void main(String[] args) {
		int favorite = 7;
		
		if(favorite < 5) {
			System.out.println("좋아하는 숫자가 5보다 작습니다.");
		} else if(favorite > 5) {
			System.out.println("좋아하는 숫자는 5보다 큽니다.");	//7은 5보다 숫자가 크므로 출력됨
		} else {
			System.out.println("좋아하는 숫자는 5입니다.");
		}
	}

}
