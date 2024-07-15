class Account {
	String id;
	String name;
	int balance;
	
	void print() {
		System.out.println(String.format("계좌번호 : %s, 이름 : %s, 잔액 : %,d", id, name, balance));
		//출력형식을 앞으로 계속 이렇게 할 거면 메소드에다가 출력 sysout을 적는 것이 좋고,  -> 작은 프로젝트
		//출력형식을 자쥬 변경되면서 사용해야 한다면 main메소드에서 sysout 을 적는 것이 좋다.  -> 큰 프로젝트
	}
	
	//함수도 타입이 필요하다. 
	//deposit 후 return 된 정보만 따로 나중에 사용해야 한다면 int형 메소드로 만들고
	//deposit 후 return된 값을 따로 사용하지 않는다면 void 사용할 수 있다. 
	
	
	//(1)
//	int deposit(int money) {
//		balance = balance + money;
//		return balance;
//	}
	
	//(2)
	void deposit(int money) {
		balance += money;
	}
	
	
	//(1)
//	int withdraw(int money) {
//		balance = balance - money;
//		return balance;
//	}
	
	//(2)
	void withdraw(int money) {
		balance -= money;
	}
	
}

public class ClassTest2 {

	public static void main(String[] args) {
		
		Account a1 = new Account();
		a1.id = "10001";
		a1.name = "홍길동";
		a1.balance = 100000;
		
		Account a2 = new Account();
		a2.id = "10002";
		a2.name = "김길동";
		a2.balance = 200000;
		
		Account a3 = new Account();
		a3.id = "10003";
		a3.name = "고길동";
		a3.balance = 300000;
		
		a1.print();
		a2.print();
		a3.print();
		
		a1.deposit(10000);
		a2.withdraw(10000);
		a1.print();
		a2.print();
		
		
	}

}


//계좌번호 : 10001, 이름 : 홍길동, 잔액 : 100000
//계좌번호 : 10002, 이름 : 김길동, 잔액 : 200000
//계좌번호 : 10003, 이름 : 고길동, 잔액 : 300000