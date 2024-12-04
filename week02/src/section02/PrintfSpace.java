package section02;

public class PrintfSpace {

	public static void main(String[] args) {
		//%nd는 n칸 만큼 확보한 후 왼쪽으로 정렬하여 출력
		System.out.printf("%5d", 1);
		System.out.println();
		System.out.printf("%5d", 12);
		System.out.println();
		System.out.printf("%5d", 123);
		System.out.println();
		System.out.printf("%5d", 1234);
		System.out.println();
		System.out.printf("%5d", 12345);
		System.out.println();
	}

}
