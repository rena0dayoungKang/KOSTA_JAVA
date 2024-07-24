
public class Employee {

	String name;
	int pay;

	public Employee(String name, int pay) {
		this.name = name;
		this.pay = pay;
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getPay() {
		return pay;
	}



	public void setPay(int pay) {
		this.pay = pay;
	}



	@Override
	public String toString() {
		return String.format("이름 : %s, 급여 : %d", name, pay);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Employee == false) {
			return false;
		}
		Employee emp = (Employee)obj;
		return name.equals(emp.name) && pay == emp.pay;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + pay;
	}
}
