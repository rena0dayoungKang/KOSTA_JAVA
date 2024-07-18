//final의 사용 방법 
class Member {
	
//	static final String society = "Running"; //모든 society가 Running 인 경우 static으로 공유 
	static final String society;
	final int no; 
	//final은 반드시 초기화가 이루어져야 한다. 명시적 초기화도 가능하지만, 객체들이 서로 공유되는 변수라면 static쓰면 됨 
	//각자 다른 값을 넣을 거면서 final 을 쓰려면 생성자에서 초기화를 해줘야 한다. 
	//static은 클래스 안에서만 붙일 수 있고, 지역변수로는 쓸 수 없음 
	 
	static {   //static final변수는 명시적 초기화 또는 static블럭에서 초기화 한다.
		society = "Running";//이렇게 static을 초기화 해주어도 된다. 
	}
	
	Member(int no) {//final instance변수는 생성자에서 초기화한다.
		this.no = no; //final초기화를 위에서 했다면 에러가난다. 변경하는 생성자는 에러가남. final 인스턴스는 생성자에서 반드시 초기화 해야 할 것. 
	}
	
	String info() {
		return "no : "+no+", society : "+society;
	}
}

public class FinalTest {

	public static void main(String[] args) {
		Member member1 = new Member(10);
		Member member2 = new Member(20);
		System.out.println(member1.info());
		System.out.println(member2.info());
	}

}
