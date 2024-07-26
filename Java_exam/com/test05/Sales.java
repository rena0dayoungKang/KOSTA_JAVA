package com.test05;

public class Sales extends Employee implements Bonus {
	
	/**
	 * 
	 */
	public Sales() {
		super();
	}

	/**
	 * @param name
	 * @param number
	 * @param department
	 * @param salary
	 */
	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	@Override
	double tax() { //세금
		return salary * 0.13;
	}
	
	@Override
	public void incentive(int pay) {	//인센티브지급
		super.salary += pay * 1.2;

	}
	
	@Override
	public String toString() {
		return "  "+name+"\t\t"+department+"\t\t"+salary;
	}

}
