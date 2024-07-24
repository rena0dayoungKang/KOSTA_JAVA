import java.util.ArrayList;
import java.util.Iterator;

import emp.Employee;
import emp.IBusinessTrip;

public class Company {
	
	//클래스 배열 
	//Employee[] employees = new Employee[100];
	//ArrayList형태로 바꾸기 0723
	ArrayList<Employee> employees = new ArrayList<>();
	int cnt;

	
//	void addEmployee(int numarg, String namearg, String deptarg, int deptNumarg) {
//		employee.num = numarg;
//		employee.name = namearg;
//		department.dept = deptarg;
//		department.deptNum = deptNumarg;
//	}
	
	public void addEmployee(Employee emp) {
		//employees[cnt++] = emp;
		employees.add(emp);
	}
	
	public void allEmployeeInfo() {
//		for (int i = 0; i < cnt; i++) {
//			System.out.println(employees[i].info());
//		}
		for (Employee employee : employees) {
			System.out.println(employee.info());
		}
	}
	
	public int getTotalPay() {
		int tot = 0;
//		for (int i = 0; i < cnt;i++) {	
////			if (employees[i] instanceof Permanet) {
////				tot += ((Permanet)(employees[i])).getPay();
////			} else if (employees[i] instanceof Freelancer) {
////				tot += ((Freelancer)(employees[i])).getPay();
////			} 자식만 가진 메서드를 부를 때는 이렇게 쓰는데 공통으로 오버라이딩된 메서드를 쓸때는 필요없다
//			tot += employees[i].getPay();
//		}
		Iterator<Employee> it = employees.iterator();
		while(it.hasNext()) {
			tot += it.next().getPay();
		}
		
		return tot;
	}

	public void regDepartment(int numarg, int deptNumarg, String deptarg) {

//		for (int i = 0; i < cnt; i++) {
//			if (employees[i].num == numarg) {
//				employees[i].department.deptNum = deptNumarg;
//				employees[i].department.dept = deptarg;
//			}
//		}
		
		Employee employee = findEmployeeByNum(numarg);
//		for (int i = 0; i < cnt; i++) {
//			if (employees[i].num == numarg) {
//				employee = employees[i];
//				break;
//			}
//		}
		if (employee == null) {
			System.out.println("없는 사번입니다.");
			return;
		}
		
		//employee.department.deptNum = deptNumarg;
		employee.getDepartment().setDeptNum(deptNumarg); 
		//employee.department.dept = deptarg;
		employee.getDepartment().setDept(deptarg);
	}
	
	public void regPay(int numarg, int salaryarg) {
		Employee employee = findEmployeeByNum(numarg);
		if (employee == null) {
			System.out.println("없는 사번입니다.");
			return;
		}
		//employee.setSalary(salaryarg);
	}
	
	public Employee findEmployeeByNum(int numarg) { //사번으로 직원 찾는 메서드
		for (Employee employee : employees) {
			if (employee.getNum() == numarg) {
				return employee;
			}
		}
		
//		Employee employee = null;
//		for (int i = 0; i < cnt; i++) {
//			if (employees[i].getNum() == numarg) {
//				employee = employees[i];
//				break;
//			}
//		}
//		return employee;
		return null;
	}

	public void regBusinessTrip(IBusinessTrip emp, int day) {
		//sales와 freelancer클래스의 공통 분모 중 두개만의 공통분모
		emp.goBusinessTrip(day);
	}
}
