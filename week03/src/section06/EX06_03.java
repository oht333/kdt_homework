package section06;

public class EX06_03 {
	public static void main(String[] args) {
		int[] intArray = new int[5];
		String[] strArray = new String[5];
		
		int[] varArray = {1, 2, 3, 4, 5};
		
		System.out.println("intArray[0] = " + intArray[0]);		//int배열을 초기화 했으니 그안의 int값도 0으로 초기화
		System.out.println("intArray[1] = " + intArray[1]);
		System.out.println("strArray[0] = " + strArray[0]);		//String배열을 초기화 했으니 그안의 String값도 null로 초기화
		System.out.println("strArray[1] = " + strArray[1]);
		System.out.println("varArray[0] = " + varArray[0]);		//선언을 할 때 이미 값이 저장되었으므로 해당되는 값을 출력
		System.out.println("varArray[1] = " + varArray[1]);
	}
}
