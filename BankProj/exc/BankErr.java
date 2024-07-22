package exc;


public enum BankErr {
	NOTACCID,		//계좌번호 없음
	EXEACCID,		//계좌번호 이미 존재
	NOTBALANCE, 	//잔액부족
	DEPOSIT,		//입금이상
	WITDRAW,		//출금이상
	BANKMENU, 		//메뉴이상 (0~5이외의 것)
	MAKEACCMENU		//계좌개설 메뉴이상 (1~2이외의 것)
}
