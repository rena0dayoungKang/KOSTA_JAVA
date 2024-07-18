import java.util.Scanner;
import acc.Account;
//다른패키지에 있을 때 import하고, 사용 하거나 import하기 싫으면 클래스이름앞에 패키지명 붙일 수있다
import acc.SpecialAccount;

public class Bank {

	Scanner scanner = new Scanner(System.in);

	Bank() {
	} // 기본생성자

	// account 여러개를 넣을 수 있는 배열 변수 Account 클래스 타입으로 생성
	Account[] accounts = new Account[100];
	int cnt;
	
	

	int selectMenu() {
		System.out.println("[코스타 은행]");
		System.out.println("0. 종료");
		System.out.println("1. 계좌개설");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 계좌조회");
		System.out.println("5. 전체계좌조회");
		System.out.println(">>");
		// return scanner.nextInt();
		return Integer.parseInt(scanner.nextLine());
	}

	void selMakeAccount() {
		System.out.println("[계좌개설]");
		System.out.println("1. 일반계좌개설");
		System.out.println("2. 특수계좌개설");
		System.out.print(">>");
		int sel = Integer.parseInt(scanner.nextLine());
		switch(sel) {
		case 1: makeAccount();break;
		case 2: makeSpecialAccount(); break;
		} 
	}

	void makeAccount() {  //일반계좌개설
		System.out.println("[일반계좌개설]");
		System.out.print("계좌번호 :");		
		String numString = scanner.nextLine();
		if(searchAccByNum(numString) != null) {
			System.out.println("계좌번호가 중복됩니다.");
		}
		System.out.print("이름:");
		String nameString = scanner.nextLine();
		System.out.print("입금액:");
		int money = Integer.parseInt(scanner.nextLine());

		accounts[cnt++] = new Account(numString, nameString, money);
		// accounts 0번 인덱스부터 계좌정보를 차례대로 채워주는 느낌

	}
	
	void makeSpecialAccount() { //특수계좌개설
		System.out.println("[특수계좌개설]");
		System.out.print("계좌번호 :");
		String numString = scanner.nextLine();
		System.out.print("이름:");
		String nameString = scanner.nextLine();
		System.out.print("입금액:");
		int money = Integer.parseInt(scanner.nextLine());
		System.out.print("등급(VIP-V, Gold-G, Silver-S, Normal-N) :");
		String grade = scanner.nextLine();

		accounts[cnt++] = new SpecialAccount(numString, nameString, money, grade);
		// accounts 0번 인덱스부터 계좌정보를 차례대로 채워주는 느낌

	}
	
	Account searchAccByNum(String accString) {
		Account acc = null;
		for (int i = 0; i < cnt; i++) {
			if (accounts[i].getAccountNum().equals(accString)) {
				acc = accounts[i];
				break;
			}
		}
		return acc;
	}

	void deposit() {
		System.out.println("[입금]");
		System.out.println("계좌번호 : ");
		String accString = scanner.nextLine();
		System.out.println("입금액 : ");
		// nexInt()는 엔터값이 자꾸 찌끄러기로 남아있음 그래서 nextLine()으로 엔터까지 가져와서 자동버려줌
		int money = Integer.parseInt(scanner.nextLine());

//		for (int i = 0; i < cnt; i++) { //계좌번호 찾는 코드는 공통코드라서 상수로 빼면 좋음
//			if (!(accounts[i].accountNum == accString)) {
//				System.out.println("잘못된 계좌번호 입니다.");
//			} else {
//				accounts[i].balance += money;
//			}
//		}
		Account acc = searchAccByNum(accString);
		if (accString == null) {
			System.out.println("계좌번호가 틀립니다.");
			return;
		}
		acc.deposit(money);
	}

	void withdraw() {
		System.out.println("[출금]");
		System.out.println("계좌번호 : ");
		String accString = scanner.nextLine();
		System.out.println("출금액 : ");
		int money = Integer.parseInt(scanner.nextLine());

		Account acc = searchAccByNum(accString);
		if (acc == null) {
			System.out.println("계좌번호가 틀립니다.");
			return;
		}
		acc.withdraw(money);
	}

	void accountInfo() {
		System.out.println("[계좌조회]");
		System.out.print("계좌번호 : ");
		String accString = scanner.nextLine();
		Account acc = searchAccByNum(accString);

		if (acc == null) {
			System.out.println("계좌번호가 틀립니다.");
			return;
		}
		System.out.println(acc.info());
		//acc.info();
	}

	void allAccountInfo() {
		System.out.println("[전체계좌조회]");
		for (int i = 0; i < cnt; i++) {
			// account배열의 나머지에는 null있으니까 cnt만큼만 돌려야 있는 계좌번호만 조회
			System.out.println(accounts[i].info());
		}
	}

	public static void main(String[] args) {

		Bank bank = new Bank(); // main메서드 먼저 실행되므로 객체 생성을 한번 더 해줘서 앞쪽도 실행될 수 있게 해준다.

		int sel;
		while (true) {
			sel = bank.selectMenu();
			if (sel == 0)
				break; // 0번 누를때 종료하는 것을 밖으로 빼줌

			switch (sel) {
			case 1:
				bank.selMakeAccount();
				break;
			case 2:
				bank.deposit();
				break;
			case 3:
				bank.withdraw();
				break;
			case 4:
				bank.accountInfo();
				break;
			case 5:
				bank.allAccountInfo();
				break;
			}
		}
	}

}
