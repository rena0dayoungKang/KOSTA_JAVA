package emp;

import dept.Department;

public class Sales extends Permanet implements IBusinessTrip {
	
	int incentive;
	
	
	public int getIncentive() {
		return incentive;
	}



	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}



	public Sales(int numarg, String nameString, Department departmentarg, int payarg, int incentivearg) {
		super(numarg, nameString, departmentarg, payarg);
		this.incentive = incentivearg;
		//setIncentive(incentivearg);
	}
	
	@Override
	public int getPay() {
		return super.getPay() + incentive;
	}
	
	
	//부모님의 pay에다가 incentive와 pay를 더해서 보내주지 않고 다시 부모님의 pay를 데리고 와서 
	//sales에서 다시 더해줘야 하기 때문에 sales에서도 info 메서드가 오버라이딩 되어야 한다. 
	@Override
	public String info() {
		return String.format("사번 : %d, 이름 : %s, 부서 : %s, 급여 : %d", num, name, department.dept, getPay());
	}



	@Override
	public void goBusinessTrip(int day) {
		incentive += day * 100000;
		
	}


	
	
	
}
