


public class Test {
	Test(){} // public을 빼면 다른 패키지에서 사용할 수 없음
	//private Test(int a) {} //다른 클래스에서 사용할 수 없음 
	int n; //다른 패키지의 클래스에서 사용할 수 있음
	
	private int age; 
	//다른 클래스는 사용할 수 없음 , 그래서 getter, setter 를 사용한다
	//정보은닉은 잘못된 사용을 막기 위해서 사용 
	//잘못된 값이 오더라도 원본 변수가 변하지 않게 하기 위함 
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Test(int n, int age) {
		super();
		this.n = n;
		this.age = age;
	}
	
	
	
}
