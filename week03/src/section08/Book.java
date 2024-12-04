package section08;

public class Book {

	void count(int bookNum) {
		System.out.println("책은 " + bookNum + "권 입니다.");
	}
	
	public static void main(String[] args) {
		Book myBook = new Book();
		myBook.count(3);	//메서드의 인수를 3으로 넣어서 값출력
	}

}
