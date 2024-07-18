//static변수의 사용 범위 
package chapter06;

public class Exam6_19 {
	public static void change(String str) {
		str += "456";
	}

	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println(str);
		change(str);
		System.out.println("After change:" + str);
		//String 클래스는 new안하고 그냥 쓴다. read only인 상수영역을 사용하는 특수 클래스
		//상수영역 (read only) 
		
		//String클래스에서 ABC123이라는 값의 주소 100& 이 생성 
		//change(str)을 수행하면서 ABC123456 이라는 값의 주소 200& 이 생성
		//새로 ABC123456 을 객체 생성해서 불러오지 않는 한 기존의 100&의 값이 나온다 
		
		//change 메서드가 str += "456";을 실행하면 새로운 문자열 "ABC123456"이 만들어지지만,
		//이 새로운 문자열은 change 메서드 안에서만 사용됩니다. main 메서드의 str은 그대로 "ABC123"입니다.
		

	}

}
