package com.test05;

public abstract class Employee {

	String name;
	int number;
	String department; //부서
	int salary;	//월급
	
	

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int number, String department, int salary) {
		this.name = name;
		this.number = number;
		this.department = department;
		this.salary = salary;
	}

	abstract double tax(); //세금

	@Override
	public String toString() {
		return "  "+name+"\t\t"+department+"\t"+salary;
	}

}
