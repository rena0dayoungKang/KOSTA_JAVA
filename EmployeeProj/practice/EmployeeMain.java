package practice;

import emp.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		Company com = new Company();
		com.addEmployee(new Employee(100, "홍길동", new Department(10, "홍보부"), 1000000));
		com.addEmployee(new Employee(101, "김길동", new Department(11, "인사과"), 2000000));
		com.addEmployee(new Employee(102, "허길동", new Department(10, "개발부"), 3000000));
		com.addEmployee(new Employee(103, "하길동", 13, "총무부", 4000000));
		com.addEmployee(new Employee(104, "차길동"));
		
		com.regDepartment(104, 10, "홍보부");
		com.regPay(104, 3000000);
		
		com.allEmployeeInfo();
		System.out.println("회사 급여 총액 : "+com.getTotalPay());
		
	}

}
