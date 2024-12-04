package section08;

public class Bus {
	void take(int m) {
		while(true) {
			if(m<3000) {
				System.out.println("교통카드를 충전하러 갑니다.");		//금액이 없어서 충천하러 가야합니다.
				return;											//출력문 띄우고 return으로 돌아감
			}
			System.out.println("버스를 탑니다.");	//금액이 충분하므로, 부족할때까지 버스타자
			m -= 1250;
		}
	}
	
	public static void main(String[] args) {
		int money = 10000;		//충전되어 있는 금액
		
		Bus bus = new Bus();
		bus.take(money);
	}

}
