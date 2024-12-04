package section02;

public class EX02_10 {

	public static void main(String[] args) {
		int myAge = 20;
		int yourAge = 30;
		int tempAge;
		
		tempAge = myAge;	//1. myAge에 저장된 데이터를 tempAge에 복사
		myAge = yourAge;	//2. myAge에 yourAge의 데이터를 복사
		yourAge = tempAge;	//3. tempAge에 저장해둔 myAge 데이터를 yourAge에 저장
		
		System.out.println(myAge);
		System.out.println(yourAge);
	}

}
