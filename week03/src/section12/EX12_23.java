package section12;

public class EX12_23 {
	public static void main(String[] args) {
		System.out.println("---TJmic 객체");
		TJmic tj = new TJmic();
		tj.connect();
		tj.music();
		tj.sing();
		
		System.out.println("\n---TJmic 객체를 BluetoothMIC로 타입 변환---");
		BluetoothMIC2 bm = tj;
		bm.connect();
		bm.music();
		bm.sing();
		
		System.out.println("\n---TJmic 객체를 Microphone로 타입 변환---");
		Microphone m = tj;	
//		m.connect();	//호출이 불가능하다 
//		m.music();		//호출이 불가능하다
		m.sing();		//sing만 추상메서드로 되어있으니 이것만 가능
		
		System.out.println("\n---TJmic 객체를 Speaker로 타입 변환---");
		Speaker s = tj;
//		s.connect();	//호출이 불가능하다
		s.music();		//music만 추상메서드로 되어있으니 이것만 가능
//		s.sing();		//호출이 불가능하다
	}
}
