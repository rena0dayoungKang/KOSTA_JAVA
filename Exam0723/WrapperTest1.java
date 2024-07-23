
public class WrapperTest1 {

	public static void main(String[] args) {
		Integer n = 10; 
		//10은 int타입. n은 Integer타입
		//Boxing 해서 int를 Integer로 사용할 수 있다.
		//(업캐스팅아님)
		
		Double d = 3.14;
		//원래 double은 8바이트 이지만 Double은 4바이트(주소)
		
		int m = n; //UnBoxing (다운캐스팅아님)
		
		//m = null; error난다
		n = null;  //n은 Wrapper클래스 타입이므로 null이 들어갈 수 있다.
		
		
	}

}
