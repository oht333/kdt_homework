package section03;

public class EX03_15 {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = false;
		
		System.out.println("###논리곱###");
		System.out.println(b1 && b2);	//하나만 true라서 false
		System.out.println(b1 && b3);	//두 항이 모두 true라서 true
		System.out.println(b2 && b4);	//두 항이 모두 false라서 false
		System.out.println();
	}

}
