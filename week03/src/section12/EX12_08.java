package section12;

public class EX12_08 {
	public static void main(String[] args) {
		PineapplePhone pp = new PineapplePhone();
		pp.powerOn();		//자식 객체를 통해 추상 클래스의 일반 메서드를 호출할 수 있음
		pp.powerOff();
		
		System.out.println();
		
		Phone tp = new ThreeStarPhone();	//자동타입변환도 가능
		tp.powerOn();
		tp.powerOff();
	}
}
