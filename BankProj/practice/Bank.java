package practice;

import java.util.Scanner;
import practice2.Account;
import practice2.SpecialAccount;

public class Bank {

	Scanner scanner = new Scanner(System.in);
	Account[] accounts = new Account[100];
	// **
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
		return Integer.parseInt(scanner.nextLine());
	}

	void selMakeAccount() {
		System.out.println("[계좌개설]");
		System.out.println("1. 일반계좌개설");
		System.out.println("2. 특수계좌개설");
		System.out.print(">>");
		int sel = Integer.parseInt(scanner.nextLine());
		switch (sel) {
		case 1:
			makeAccount();
			break;
		case 2:
			makeSpecialAccount();
			break;
		}
	}

	void makeAccount() { // 일반계좌 개설
		System.out.println("[계좌개설]");
		System.out.print("계좌번호 :");
		// **
		String accountarg = scanner.nextLine();

		// **
		if (searchByNum(accountarg) != null) {
			System.out.println("계좌번호가 중복입니다.");
		}

		System.out.print("이름 :");
		String namearg = scanner.nextLine();
		System.out.print("잔액 :");
		int balancearg = Integer.parseInt(scanner.nextLine());

		// **
		accounts[cnt++] = new Account(accountarg, namearg, balancearg);
//		System.out.println(accounts[0]);
	}

	void makeSpecialAccount() { // 특수계좌 개설
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
	}

	// 계좌번호 찾는 메서드
	Account searchByNum(String accString) {
		Account account = null;
		for (int i = 0; i < cnt; i++) {
			if (accounts[i].getAccount().equals(accString)) {
				account = accounts[i];
				break;
				// return account;
			}
		}

		return account;

	}

	// 왜 여기다가 계좌번호 틀린거 넣으면 안되지?
	// 왜냐하면 애초에 계좌번호 입력하고 그거랑 맞는 거를 찾아서 클래스배열에서
	// 찾아오는 거기 때문에 틀린거를 애초에 찾아올 수 없다.

	void deposit() {
		System.out.println("[입금]");
		System.out.println("계좌번호 : ");
		String accString = scanner.nextLine();
		Account account = searchByNum(accString);

		// **
		if (accString == null) {
			System.out.println("계좌번호가 틀립니다");
			return;
		}

		System.out.println("입금액 : ");
		int money = Integer.parseInt(scanner.nextLine());

		account.deposit(money);

	}

	void withdraw() {
		System.out.println("[출금]");
		System.out.println("계좌번호 : ");
		String accString = scanner.nextLine();
		Account account = searchByNum(accString);

		if (accString == null) {
			System.out.println("계좌번호가 틀립니다.");
			return;
		}

		System.out.println("출금액 : ");
		int money = Integer.parseInt(scanner.nextLine());
		account.withdraw(money);
	}

	void accountInfo() {
		System.out.println("[계좌조회]");
		System.out.print("계좌번호 : ");
		String accString = scanner.nextLine();
		Account account = searchByNum(accString);
		if (accString == null) {
			System.out.println("계좌번호가 틀립니다.");
			return;
		}
		System.out.println(account.info());

	}

	void allAccountInfo() {
		System.out.println("[전체 계좌조회]");
		for (int i = 0; i < cnt; i++) {
			System.out.println(accounts[i].info());
		}
	}

	public static void main(String[] args) {

		Bank bank = new Bank();
		int sel;
		while (true) {
			sel = bank.selectMenu();
			if (sel == 0)
				break;
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
