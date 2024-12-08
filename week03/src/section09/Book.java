package section09;

public class Book {
	String title = "제목없음";
	int series = 1;
	int page = 100;
	
	Book() {
		
	}
	
	Book(String t) {
		title = t;
	}
	
	Book(String t, int p) {
		title = t;
		page = p;
	}
	
	Book(int s, String t) {		//매개변수의 개수, 종류, 순서를 다르게 해서 여러개의 생성자를 만들 수 있다
		series = s;
		title = t;
	}
}
