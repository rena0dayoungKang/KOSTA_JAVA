package com.test05;

public class Secretary extends Employee implements Bonus {
	
	public Secretary() {
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * @param name
	 * @param number
	 * @param department
	 * @param salary
	 */
	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	


	@Override
	double tax() { //세금
		return salary * 0.1;
	}


	@Override
	public void incentive(int pay) {  //인센티브지급
		super.salary += pay * 0.8;
		
	}
	
	@Override
	public String toString() {
		return "  "+name+"\t\t"+department+"\t"+salary;
	}
	
	

}
