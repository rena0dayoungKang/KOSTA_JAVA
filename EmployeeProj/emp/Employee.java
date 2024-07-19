package emp;

import dept.Department;

public class Employee {
	int num;
	String name;
	Department department;
	//int salary;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

//	public int getSalary() {
//		return salary;
//	}
//
//	public void setSalary(int salary) {
//		this.salary = salary;
//	}
	
	public Employee() {}

	Employee(int numarg, String nameString, Department department, int salaryarg) {
		this.num = numarg;
		this.name = nameString;
		this.department = department;
		//this.salary = salaryarg;
	}
	
	Employee(int numarg, String nameString, int deptNumarg, String deptString, int salaryarg) {
		this(numarg, nameString, new Department(deptNumarg, deptString), salaryarg);
	}
	
	Employee(int numarg, String nameString) {
		this(numarg, nameString, new Department(), 0);
	}
	
	Employee(int numarg, String nameString, Department department) {
		this.num = numarg;
		this.name = nameString;
		this.department = department;
	}

	public String info() {
		return "s";
	}
	
	public int getPay() { 
		//Company 의 getTotal()메서드에서 getPay()를 permanent클래스와 Freelancer클래스에 있는 pay를 가져오기 위한 껍데기
		//abstract메서드가 하나라도 있으면 abstract class로 만들어 주어야 한다. 
		//abstract 클래스는 해당 클래스를 상속받아서 구현하라는 의미가 된다. 
		//추상클래스 왜 만들까? 강제로 구현을 시키기 위한 클래스 
		return 0;
	}

}
