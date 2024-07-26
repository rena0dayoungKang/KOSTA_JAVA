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
import java.util.Map;
import java.util.Scanner;

import acc.Account;
import acc.SpecialAccount;
import exc.BankErr;
import exc.BankException;

public class Bank2 {

	Scanner scanner = new Scanner(System.in);
	Map<String, Account> accounts = new HashMap<>();
	// 현재 계좌정보들이 Hashmap에 있음. hashmap이 있는 Bank클래스에 파일 입출력 넣는게 맞음

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

		if (accounts.containsKey(numString)) { // searchByNum메서드 지움
			throw new BankException("계좌오류", BankErr.EXEACCID);
		}

		System.out.print("이름:");
		String nameString = scanner.nextLine();
		System.out.print("입금액:");
		int money = Integer.parseInt(scanner.nextLine());
		if (money < 0) {
			throw new BankException("입금오류", BankErr.DEPOSIT);
		}
		accounts.put(numString, new Account(numString, nameString, money));

	}

	void makeSpecialAccount() throws BankException { // 특수계좌개설
		System.out.println("[특수계좌개설]");
		System.out.print("계좌번호 :");
		String numString = scanner.nextLine();

		if (accounts.containsKey(numString)) {
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
		accounts.put(numString, new SpecialAccount(numString, nameString, money, grade));

	}

	void deposit() throws BankException {
		System.out.println("[입금]");
		System.out.println("계좌번호 : ");
		String accString = scanner.nextLine();

		System.out.println("입금액 : ");

		int money = Integer.parseInt(scanner.nextLine());
		if (!accounts.containsKey(accString)) {
			throw new BankException("계좌오류", BankErr.NOTACCID);
		}
		accounts.get(accString).deposit(money);

	}

	void withdraw() throws BankException {
		System.out.println("[출금]");
		System.out.println("계좌번호 : ");
		String accString = scanner.nextLine();

		System.out.println("출금액 : ");
		int money = Integer.parseInt(scanner.nextLine());

		if (!accounts.containsKey(accString)) {
			throw new BankException("계좌오류", BankErr.NOTACCID);
		}

		accounts.get(accString).withdraw(money);

	}

	void accountInfo() throws BankException {
		System.out.println("[계좌조회]");
		System.out.print("계좌번호 : ");
		String accString = scanner.nextLine();

		if (!accounts.containsKey(accString)) {
			throw new BankException("계좌오류", BankErr.NOTACCID);
		}

		System.out.println(accounts.get(accString));
	}

	void allAccountInfo() {
		System.out.println("[전체계좌조회]");

//		Iterator<Account> it = accounts.values().iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}

		for (Account acc : accounts.values()) {
			System.out.println(acc);
		}
	}

	public void saveAccsBin() {
		FileOutputStream fos = null;
		DataOutputStream dos = null;

		try {
			fos = new FileOutputStream("accs.bin");
			dos = new DataOutputStream(fos);

			dos.writeInt(accounts.size()); // 계좌갯수
			for (Account account : accounts.values()) { // 계좌구분 : 특수계좌 - S, 일반계좌 - N
				if (account instanceof SpecialAccount) {
					dos.writeChar('S');
					dos.writeUTF(((SpecialAccount) account).getGrade()); // 등급
				} else {
					dos.writeChar('N');
				}
				dos.writeUTF(account.getAccountNum()); // 계좌번호
				dos.writeUTF(account.getName()); // 이름
				dos.writeInt(account.getBalance()); // 잔액
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (dos != null)
					dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void loadAccsBin() {
		// 반복문 밖에서 불러와야 한다.
		FileInputStream fis = null;
		DataInputStream dis = null;

		try {
			fis = new FileInputStream("accs.bin");
			dis = new DataInputStream(fis);

			int cnt = dis.readInt();
			char sect;
			String num = "", grade = "", name = "";
			int balance = 0;

			for (int i = 0; i < cnt; i++) {
				sect = dis.readChar(); // 계좌구분 : S, N
				if (sect == 'S') {
					grade = dis.readUTF();
				}
				num = dis.readUTF();
				name = dis.readUTF();
				balance = dis.readInt();

				if (sect == 'S') {
					accounts.put(num, new SpecialAccount(num, name, balance, grade));
				} else {
					accounts.put(num, new Account(num, name, balance));
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (dis != null)
					dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void saveAccsTxt() {
		FileWriter fw = null;
		BufferedWriter bw = null;

		// 스트림 코드들은 try catch반드시 있어야
		try {
			fw = new FileWriter("accs.txt");
			bw = new BufferedWriter(fw);

			String accString = "";
			for (Account acc : accounts.values()) {
				accString = acc.getAccountNum();
				accString += "#" + acc.getName();
				accString += "#" + acc.getBalance();
				if (acc instanceof SpecialAccount) {
					accString += "#" + ((SpecialAccount) acc).getGrade();
				}

				bw.write(accString);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void loadAccsTxt() {
		FileReader fr = null;
		BufferedReader br = null;
		DataInputStream dis = null;
		
		try {
			fr = new FileReader("accs.txt");
			br = new BufferedReader(fr);
			
			String accString = "";
			while ((accString = br.readLine()) != null) {
				String[] acc = accString.split("#");
				String num = acc[0];
				String name = acc[1];
				int balance = Integer.parseInt(acc[2]);
				if(acc.length == 4) {
					String grade = acc[3];
					accounts.put(num, new SpecialAccount(num, name, balance, grade));
				} else {
					accounts.put(num, new Account(num, name, balance));
				}
					
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

	public static void main(String[] args) {

		Bank2 bank = new Bank2(); // main메서드 먼저 실행되므로 객체 생성을 한번 더 해줘서 앞쪽도 실행될 수 있게 해준다.
		bank.loadAccsTxt();

		int sel;
		while (true) {
			try {
				sel = bank.selectMenu();

				if (sel == 0) {
					bank.saveAccsTxt();
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
/*
 * 1001 홍길동 100000 1002 김길동 200000 VIP
 * 
 * 2N1001홍길동100000SVIP1002김길동200000 -> 바이너리로 저장된 파일에서 아마 깨져보일 것 맨앞의 2는 len
 * (int)값 writeInt writeChar writeUTF writeUTF writeInt writeChar writeUTF
 * writeUTF writeUTF writeInt
 * 
 * 
 * 1001#홍길동#100000 구분자넣어서 split사용해서 배열로 만들어주기 1002#김길동#200000#VIP 스페이스나 콤마로
 * 구분한다고 하면 데이터가 짤릴 수 있어서
 * 
 */
