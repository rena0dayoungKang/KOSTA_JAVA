package dept;

public class Department {
	int deptNum; //학과번호 
	String dept;//학과이름
	
	
	public int getDeptNum() {
		return deptNum;
	}
	public void setDeptNum(int deptNum) {
		this.deptNum = deptNum;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public Department() {
		
	}
	public Department(int deptNum, String dept) {
		this.deptNum = deptNum;
		this.dept = dept;
	}
	
	
	
	
	
}
