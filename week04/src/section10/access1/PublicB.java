package section10.access1;

public class PublicB {
	public static void main(String[] args) {
		DefaultC c = new DefaultC();	//에러 : The type PublicA is not visible
		//c.variableC = 10; <- 필드가 public이더라도 객체를 생성하지 못하기 때문에 사용할 수 없다.
	}
}
