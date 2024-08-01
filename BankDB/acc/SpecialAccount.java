package acc;

import exc.BankException;

public class SpecialAccount extends Account{
	
	String grade;
	//Account account = new SpecialAccount(); 부모님한테 있는거는 그냥 받아서 쓰는거기 때문에 새로 부를 필요가 없음
	
	
	//getter,setter
	public String getGrade() {
		switch(grade.charAt(0)) {
		case 'V' : 
		case 'v' : this.grade = "VIP"; break;
		case 'G' :
		case 'g' : this.grade = "Gold"; break;
		case 'S' : 
		case 's' : this.grade = "Silver"; break;
		default : this.grade = "Normal"; break;
		}
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	//contructor
	public SpecialAccount() {}
	
	public SpecialAccount(String accString, String nameString, int moneyarg, String gradeString) {
		super(accString, nameString, moneyarg);
		setGrade(gradeString);
//		this.setAccountNum(accString);
//		this.setName(nameString);
//		this.setBalance(moneyarg);
//		this.setGrade(gradeString);
	}
	
	@Override
	public void deposit(int money) throws BankException { //특수계좌의 입금처리
		switch(grade) {
		case "VIP" : money *= 1.04; break;
		case "Gold" : money *= 1.03; break;
		case "Silver" : money *= 1.02; break;
		case "Normal" : money *= 1.01; break;
		} 
		super.deposit(money); //account클래스에서 throw를 던지므로, specialaccount도 throw필요
	}
	
//	@Override
//	public String info() {
//		return super.info()+", 등급:"+getGrade();
//	}
	
	@Override
	public String toString() {
		return super.toString()+", 등급:"+getGrade();
	}
	 
	
	
	
	
	
	
	
	
}
