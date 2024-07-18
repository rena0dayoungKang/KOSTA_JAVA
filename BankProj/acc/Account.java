package acc;

public class Account {
	
	String accountNum;
	String name;
	int balance;
	
	
	
	//getter, setter
	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	//생성자
	public Account() {} //기본생성자를 만들어 두는 습관 
	
	public Account(String accarg, String namearg, int money) {
		this.accountNum = accarg;
		this.name = namearg;
		this.balance = money;
	}
	
//	int deposit(int money) {
//		balance += money;
//		return balance;
//	}	
	
//	int withdraw(int money) {
//		balance -= money;
//		return balance;
//	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) {
		balance -= money;
	}
	
	public String info() { //String형태로 출력 형식을 만들어서 main에서 호출할때 return 하는 형식이다. 
		return String.format("계좌번호 : %s, 이름 : %s, 잔액 : %,d", accountNum, name, balance);
	}

	
	public static void main(String[] args) {
		Account acc1 = new Account("10001", "홍길동", 100000);
		System.out.println(acc1.info());
		acc1.deposit(10000);
		System.out.println(acc1.info());
		acc1.withdraw(5000);
		System.out.println(acc1.info());
	}

}


//계좌번호 : 10001, 이름 : 홍길동, 잔액 : 100000
//계좌번호 : 10001, 이름 : 홍길동, 잔액 : 110000
//계좌번호 : 10001, 이름 : 홍길동, 잔액 : 105000