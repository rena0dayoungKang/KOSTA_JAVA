package emp;

import dept.Department;

public class Freelancer extends Employee implements IBusinessTrip {

	int time;
	int payPerTime;

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getPayPerTime() {
		return payPerTime;
	}

	public void setPayPerTime(int payPerTime) {
		// this.payPerTime = time * payPerTime;
		this.payPerTime = payPerTime;
	}

	public Freelancer(int numarg, String nameString, Department departmentarg, int timearg, int payPerTimearg) {
		super(numarg, nameString, departmentarg);
		// this.time = timearg;
		setTime(timearg);
		// this.payPerTime = payPerTimearg;
		setPayPerTime(payPerTimearg);
	}

	@Override
	public int getPay() { // 실제로 compnay에서 getTotal메서드 사용할 때 불러와지는 getPay()
		return time * payPerTime;
	}

	@Override
	public String info() {
		return String.format("사번 : %d, 이름 : %s, 부서 : %s, 급여 : %d", num, name, department.dept, getPay());
	}

	@Override
	public void goBusinessTrip(int day) {
		time += (day * 24);

	}

}
