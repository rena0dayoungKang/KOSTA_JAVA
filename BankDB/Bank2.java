import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import acc.Account;
import acc.SpecialAccount;
import dao.BankDAO;
import exc.BankErr;
import exc.BankException;

public class Bank2 {

	Scanner scanner = new Scanner(System.in);
	// 해쉬맵을 삭제하고 데이터베이스에서 받아와서 사용할 것임.

	int selectMenu() throws BankException {

		System.out.println("[코스타 은행]");
		System.out.println("0. 종료");
		System.out.println("1. 계좌개설");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 계좌조회");
		System.out.println("5. 전체계좌조회");
		System.out.println(">>");
		int sel = Integer.parseInt(scanner.nextLine());
		if (sel < 0 || sel > 5) {
			throw new BankException("메뉴오류", BankErr.BANKMENU);
		}
		return sel;

	}

	void selMakeAccount() throws BankException {// 메인으로 익셉션 넘김
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
		default:
			throw new BankException("메뉴오류", BankErr.MAKEACCMENU);
		}
	}

	void makeAccount() throws BankException { // 일반계좌개설
		System.out.println("[일반계좌개설]");
		System.out.print("계좌번호 :");
		String numString = scanner.nextLine();

		Account acc = BankDAO.selectAccount(numString);

		if (acc != null) { // searchByNum메서드 지움
			throw new BankException("계좌오류", BankErr.EXEACCID);
		}

		System.out.print("이름:");
		String nameString = scanner.nextLine();
		System.out.print("입금액:");
		int money = Integer.parseInt(scanner.nextLine());
		BankDAO.insertAccount(new Account(numString, nameString, money));

	}

	void makeSpecialAccount() throws BankException { // 특수계좌개설
		System.out.println("[특수계좌개설]");
		System.out.print("계좌번호 :");
		String numString = scanner.nextLine();

		Account acc = BankDAO.selectAccount(numString);
		if (acc != null) {
			throw new BankException("계좌오류", BankErr.EXEACCID);
		}

		System.out.print("이름:");
		String nameString = scanner.nextLine();
		System.out.print("입금액:");
		int money = Integer.parseInt(scanner.nextLine());
		if (money < 0) {
			throw new BankException("입금오류", BankErr.DEPOSIT);
		}
		System.out.print("등급(VIP-V, Gold-G, Silver-S, Normal-N) :");
		String grade = scanner.nextLine();
		BankDAO.insertAccount(new SpecialAccount(numString, nameString, money, grade));
	}

	void deposit() throws BankException {
		System.out.println("[입금]");
		System.out.println("계좌번호 : ");
		String accString = scanner.nextLine();

		System.out.println("입금액 : ");

		int money = Integer.parseInt(scanner.nextLine());
		Account acc = BankDAO.selectAccount(accString);
		if (acc == null) {
			throw new BankException("계좌오류", BankErr.NOTACCID);
		}
		acc.deposit(money);
		BankDAO.updateBalance(acc);

	}

	void withdraw() throws BankException {
		System.out.println("[출금]");
		System.out.println("계좌번호 : ");
		String accString = scanner.nextLine();

		System.out.println("출금액 : ");
		int money = Integer.parseInt(scanner.nextLine());
		Account acc = BankDAO.selectAccount(accString);
		if (accString == null) {
			throw new BankException("계좌오류", BankErr.NOTACCID);
		}

		acc.withdraw(money);
		BankDAO.updateBalance(acc);
	}

	void accountInfo() throws BankException {
		System.out.println("[계좌조회]");
		System.out.print("계좌번호 : ");
		String accString = scanner.nextLine();
		Account acc = BankDAO.selectAccount(accString);
		if (acc == null) {
			throw new BankException("계좌오류", BankErr.NOTACCID);
		}

		System.out.println(acc);
	}

	void allAccountInfo() {
		System.out.println("[전체계좌조회]");

//		Iterator<Account> it = accounts.values().iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
		List<Account> accs = BankDAO.selectAllAcount();
		for (Account acc : accs) {
			System.out.println(acc);
		}
	}

	public static void main(String[] args) {

		Bank2 bank = new Bank2(); // main메서드 먼저 실행되므로 객체 생성을 한번 더 해줘서 앞쪽도 실행될 수 있게 해준다.

		int sel;
		while (true) {
			try {
				sel = bank.selectMenu();

				if (sel == 0) {
					break; // 0번 누를때 종료하는 것을 밖으로 빼줌
				}
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
			} catch (NumberFormatException e) {
				// e.printStackTrace();
				System.out.println("입력형식이 맞지 않습니다.");
			} catch (BankException e) {
				System.out.println(e.toString());
			}
		}
	}

}

