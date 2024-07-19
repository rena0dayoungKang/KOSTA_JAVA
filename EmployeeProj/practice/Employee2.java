package practice;

import dept.Department;

public class Employee2 {
	
	int num; //사번
	String name; //이름
	Department department; //부서클래스
	int salary; //급여

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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Permanet() {
		// TODO Auto-generated constructor stub
	}
	
	public Permanet(int numarg, String namearg, Department departmentarg, int salaryarg){
		this.num = numarg;
		this.name = namearg;
		//Department department = departmentarg;
		this.department = departmentarg;
		this.salary = salaryarg;
		
	}

	public Permanet(int numarg, String namearg, int deptNumarg, String deptarg, int salaryarg) {
//		this.num = numarg;
//		this.name = namearg;
//		this.department = new Department(deptNumarg, deptarg);
//		this.salary = salaryarg;
		this(numarg, namearg, new Department(deptNumarg, deptarg),salaryarg);
	}
	
	public Permanet(int numarg, String namearg) {
		this(numarg, namearg, new Department(), 0);
	}

	public String info() {
		return String.format("사번 : %d, 이름 : %s, 부서 : %s, 급여 : %d", num, name, department.getDept(), salary);
	}




}
