package stu;
import dept.Department;

public class Student {
	int num; //학번
	String name; //이름
	int grade; //학년
	String school; //대학교
 	Department department;
 	
 	
 	
// 	public Student(int numarg, String namearg, int gradearg, Department department, String schoolarg) {
// 		this.num = numarg;
// 		this.name = namearg;
// 		this.grade = gradearg;
// 		this.department = department;
// 		this.school = schoolarg;
// 	}
 	
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



	public int getGrade() {
		return grade;
	}



	public void setGrade(int grade) {
		this.grade = grade;
	}



	public String getSchool() {
		return school;
	}



	public void setSchool(String school) {
		this.school = school;
	}



	public Department getDepartment() {
		return department;
	}



	public void setDepartment(Department department) {
		this.department = department;
	}



	public Student(int numarg, String namearg, int gradearg, int deptNumarg, String deptarg, String schoolarg) {
 		this.num = numarg;
 		this.name = namearg;
 		this.grade = gradearg;
 		
// 		Department deptDepartment = new Department();
// 		deptDepartment.setDeptNum(deptNumarg);
// 		deptDepartment.setDept(deptarg);
// 		this.department = deptDepartment;
 		this.department = new Department(deptNumarg, deptarg);
 		
 		this.school = schoolarg;
 	}

	public String toString() {
		return String.format("학번 : %d, 이름 : %s, 학년 : %d, 학과 : %s, 대학 : %s", num, name, grade, department.getDept(), school);
	}

}
