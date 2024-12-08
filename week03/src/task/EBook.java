package task;

class EBook extends Book {
    double sizeInMB;

    // 기본 생성자
    public EBook() {
        super(); // 부모 클래스 생성자 호출
        this.sizeInMB = 0;
    }

    // 제목, 작가, 크기를 받는 생성자
    public EBook(String title, String author, double sizeInMB) {
        super(title, author); // 부모 클래스의 생성자 호출
        this.sizeInMB = sizeInMB;
    }

    // 정보 출력 메서드 오버라이딩
    @Override
    public void displayInfo() {
        System.out.println("제목: " + title + ", 작가: " + author + ", 크기: " + sizeInMB + "MB");
    }
}
