package task;

class Book {
    String title;
    String author;

    // 기본 생성자
    public Book() {
        this.title = "알수없음";
        this.author = "알수없음";
    }

    // 제목만 받는 생성자
    public Book(String title) {
        this.title = title;
        this.author = "알수없음";
    }

    // 제목과 작가를 모두 받는 생성자
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // 정보 출력 메서드
    public void displayInfo() {
        System.out.println("제목: " + title + ", 작가: " + author);
    }
}