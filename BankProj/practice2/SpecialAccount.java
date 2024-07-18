package practice2;

public class SpecialAccount extends Account {

	String grade;

	// getter, setter
	public String getGrade() {
		switch (grade.charAt(0)) {
		case 'v':
		case 'V':
			this.grade = "VIP";
			break;
		case 'g':
		case 'G':
			this.grade = "Gold";
			break;
		case 's':
		case 'S':
			this.grade = "Silver";
			break;
		default:
			this.grade = "Normal";
			break;
		}
		return grade;
	}
	
	public void setGrade(String gradeString) {
		this.grade = gradeString;
	}
	
	// constructor
	public SpecialAccount() {
		// 부모에 기본생성자 추가
	}

	public SpecialAccount(String accountString, String nameString, int balancearg, String gradeString) {
		super(accountString, nameString, balancearg);
		setGrade(gradeString);
	}

	// method
	@Override
	public void deposit(int money) {
		switch (grade) {
		case "VIP":
			money *= 1.04;
			break;
		case "GOLD":
			money *= 1.03;
			break;
		case "Silver":
			money *= 1.02;
			break;
		case "Normal":
			money *= 1.01;
			break;
		}
		super.deposit(money);
	}
	
	@Override
	public String info() {
		return super.info()+ ", 등급:" +getGrade();
	}
}
