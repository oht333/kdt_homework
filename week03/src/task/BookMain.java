package task;

public class BookMain {
	public static void main(String[] args) {
        // Book 객체 
        Book book1 = new Book();
        Book book2 = new Book("자바의 정석");
        Book book3 = new Book("멘토 씨리즈", "코리아IT아카데미");

        // EBook 객체 
        EBook ebook1 = new EBook();
        EBook ebook2 = new EBook("자바", "Horstmann, Cay S.", 5.3);

        // 출력
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
        ebook1.displayInfo();
        ebook2.displayInfo();
	}
}
