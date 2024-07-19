package dept;
import java.util.jar.Attributes.Name;

public class Department {
	
	int deptNum; //부서코드
	public String dept; //부서이름
	
	
	
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
		dept = "미정";
	}

	public Department(int deptNumarg, String deptarg) {
		this.deptNum = deptNumarg;
		this.dept = deptarg;
	}

}
