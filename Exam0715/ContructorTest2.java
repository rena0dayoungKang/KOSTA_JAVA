//생성자
class Member {
	int num;
	String name;
	String phone;
	String email;
	String address;
	
	Member() {} //기본생성자도 만들어줘야 한다. 
	//생성자를 하나라도 만들면 기본생성자는 수동으로 만들어야 한다. 
	
	Member(int numarg, String namearg, String phonearg){ //이렇게도 간단히 만들 수 있음 
		this(numarg, namearg, phonearg, null, null);
	}
	
	Member(int numarg, String namearg, String phonearg, String emailarg) {
		this(numarg, namearg, phonearg, emailarg, null);
	}
	
	Member(int numarg, String namearg, String phonearg, String emailarg, String addressarg) {
		num = numarg;
		name = namearg;
		phone = phonearg;
		email = emailarg;
		address = addressarg;
	}
	
	Member(int numarg) {
		num = numarg;
	}
	
	Member(int numarg, String namearg) {
		this(numarg, namearg, null, null, null);
	}

	String info() {
		return String.format("[%d, %s, %s, %s, %s]", num, name, phone, email, address);
	}
}

public class ContructorTest2 {

	public static void main(String[] args) {
		Member member1 = new Member(); 
		//생성자가 하나도 없으면, 기본생성자 호출
		//생성자가 하나라도 있으면 기본생성자도 만들어줘야 한다. 
		member1.num = 101;
		member1.name = "고길동";
		member1.phone = "01012344321";
		member1.email = "go@kosta.com";
		member1.address = "서울시 강서구";
		
		Member member2 = new Member(100, "홍길동", "01012345678","hog@kosta.com", "서울시 금천구");
		
		Member member3 = new Member(102, "김길동");
		Member member4 = new Member(103, "하길동", "010-5678-8766");
		Member member5 = new Member(104);
		Member member6 = new Member(105, "차길동", "010-2345-6543","cha@kosta.com");
		
		
		System.out.println(member1.info());
		System.out.println(member2.info());
		System.out.println(member3.info());
		System.out.println(member4.info());
		System.out.println(member5.info());
		System.out.println(member6.info());
	}

}
