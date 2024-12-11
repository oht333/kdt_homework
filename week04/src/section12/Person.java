package section12;

public class Person {
	Phone3 p;
	
	Person (Phone3 p) {
		this.p = p;
	}
	
	void buyNewPhone(Phone3 p) {
		this.p = p;
		System.out.println("= = = = = = = = = = = = = = = = = =");
		System.out.println("새 폰을 샀습니다!");
	}
	
	void turnOnPhone() {
		p.powerOn();
	}
	
	void turnOffPhone() {
		p.powerOff();
	}
	
	void watchUtube() {
		if(p.isOn()) {
			p.watchUtube();
		} else {
			System.out.println("폰이 꺼져 있기 때문에 U튜브를 볼 수 없습니다.");
		}
	}
	
	void chargePhone() {
		p.charge();
	}
}
