package acc;

import exc.BankErr;
import exc.BankException;

public class Account {

	String accountNum;
	String name;
	int balance;

	// getter, setter
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

	// 생성자
	public Account() {
	} // 기본생성자를 만들어 두는 습관

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

	public void deposit(int money) throws BankException {
		if (money <= 0)
			throw new BankException("입금오류", BankErr.DEPOSIT);
		balance += money;
	}

	public void withdraw(int money) throws BankException {
		if (money <= 0)
			throw new BankException("출금오류", BankErr.WITDRAW);
		if (money > balance)
			throw new BankException("출금오류", BankErr.NOTBALANCE);
		balance -= money;
	}

//	public String info() { // String형태로 출력 형식을 만들어서 main에서 호출할때 return 하는 형식이다.
//		return String.format("계좌번호 : %s, 이름 : %s, 잔액 : %,d", accountNum, name, balance);
//	}

	@Override
	public String toString() {	//toString()오버라이딩 메소드는 호출하는 쪽에서 println으로만 적어도 호출됨
		return String.format("계좌번호 : %s, 이름 : %s, 잔액 : %,d", accountNum, name, balance);
	}

//	public static void main(String[] args) throws BankException {
//		Account acc1 = new Account("10001", "홍길동", 100000);
//		System.out.println(acc1.info());
//		acc1.deposit(10000);
//		System.out.println(acc1.info());
//		acc1.withdraw(5000);
//		System.out.println(acc1.info());
//	}

}

//계좌번호 : 10001, 이름 : 홍길동, 잔액 : 100000
//계좌번호 : 10001, 이름 : 홍길동, 잔액 : 110000
//계좌번호 : 10001, 이름 : 홍길동, 잔액 : 105000