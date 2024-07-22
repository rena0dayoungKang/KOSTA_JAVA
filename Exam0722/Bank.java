import java.awt.Menu;

public class Bank {
	public static void accInfo() throws BankException { // 내가만든 예외는 선언부까지 해줘야함
		throw new BankException("계좌오류", BankErr.NOTACCID);
	}

	public static void menu() throws BankException {
		throw new BankException("메뉴선택", BankErr.BANKMENU);
	}
	
	public static void deposit() throws BankException {
		throw new BankException("입금오류", BankErr.DEPOSIT);
	}

	
	
	public static void main(String[] args) {
		try {
			// throw new BankException("계좌오류", BankErr.NOTACCID);
			//accInfo();
			//menu();
			deposit();
		} catch (BankException e) {
			System.out.println(e.toString());
		}
	}

}
