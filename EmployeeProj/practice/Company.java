package practice;

import emp.Employee;

public class Company {
	Employee[] employees = new Employee[100];
	int cnt;
	
	void addEmployee(Employee emp) {
		employees[cnt++] = emp;
	}
	
	//제일 생각 안나는 부분 
	Employee findEmployeeByNum(int numarg) {
		Employee employee= null;
		for (int i = 0; i < cnt; i++) {
			if (employees[i].num == numarg) {
				employee = employees[i]; 
				break;
			} 
		}
		return employee;
	}
	
	//여기도 생각앙났어
	void regDepartment(int numarg, int deptNumarg, String deptString) {
		
		//여기서부터 생각안남..
		Employee employee = findEmployeeByNum(numarg); 
		if (employee == null) {
			System.out.println("없는 사번입니다.");
			return;
		}
		
		employee.department.deptNum = deptNumarg;
		employee.department.dept = deptString;
	}
	
	//두줄인데 왜 생각이 안난지?
	void allEmployeeInfo() {
		for (int i = 0; i < cnt; i++) {
			System.out.println(employees[i].info());
		}
	}
	
	void regPay(int numarg, int salaryarg) {
		Employee employee = findEmployeeByNum(numarg);
		if (employee == null) {
			System.out.println("없는 사번입니다.");
			return;
		}
		employee.salary = salaryarg;
	}
	
	int getTotalPay() {
		int tot = 0;
		for (int i = 0; i < cnt; i++) {
			tot += employees[i].salary;
		}
		return tot;
	}

}
