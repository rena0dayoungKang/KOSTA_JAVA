package practice2;

public class Account {
	String account; //계좌번호
	String name; //이름
	int balance; //잔액
	
	//getter,setter
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
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

	//constructor
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(String accountarg, String namearg, int money) {
		this.account = accountarg;
		this.name = namearg;
		this.balance = money;
	}
	
	//method
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) {
		balance -= money;
	}
	
	public String info() {
		return String.format("계좌번호 : %s, 이름 : %s, 잔액 : %d", account, name, balance);
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
