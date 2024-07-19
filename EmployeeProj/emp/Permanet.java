package emp;

import dept.Department;

public class Permanet extends Employee {

	int pay;

	
	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public Permanet(int numarg, String nameString, Department departmentarg, int payarg) {
		super(numarg, nameString, departmentarg);
		this.pay = payarg;
		//setPay(payarg); //위의 줄이랑 둘 다 써도 된다. 
	}
	
	@Override
	public String info() {
		return String.format("사번 : %d, 이름 : %s, 부서 : %s, 급여 : %d", num, name, department.dept, pay);
	}

}
