import dept.Department;
import stu.Student;

public class StudentMain {

	static Student[] students = new Student[100];
	static int cnt;
	
	
	static Student findStudentByNum(int numarg) { //학생을 학번으로 찾기 
		Student student = null;
		for (int i = 0; i < cnt; i++) {
			if(students[i].getNum() == numarg) {
				student = students[i];
				break;
			}
		}
		return student;
	}
	
	static void addStudent(Student student) {
		//메인 static에서 함수를 불러오려면 static으로 만들어야 한다 
		students[cnt++] = student;
	}
	
	static void transfer(int numarg, int deptNumarg, String deptarg) { //학생을 조회 후 전과시키기 
		Student student = findStudentByNum(numarg);
		if(student == null) {
			System.out.println("학번 오류");
			return;
		}
		if(student.getDepartment() == null) { //학생이 학과가 없는 경우 
			student.setDepartment(new Department(deptNumarg, deptarg));
		} else { //학생이 학과가 있는 경우 
			student.getDepartment().setDeptNum(deptNumarg);
			student.getDepartment().setDept(deptarg);
		}
	}
	
	static void studentInfoByStudNum(int numarg) { //학번으로 찾은 학생 한명조회
		Student student = findStudentByNum(numarg);
		if(student == null) {
			System.out.println("학번오류");
			return;
		}
		System.out.println(student.toString());
	}
	
	static void studentsInfoByDeptNum(int deptNumarg) { //학과번호로 찾은 학생 목록 조회
		for (int i = 0; i < cnt; i++) {
			if (students[i].getDepartment().getDeptNum() == deptNumarg) {
				System.out.println(students[i].toString());
			}
		}
	}
	
	
	public static void main(String[] args) {
		addStudent(new Student(100, "홍길동", 1, 10, "기계공학", "호서대"));
		addStudent(new Student(101, "김길동", 2, 11, "전자공학", "호서대"));
		addStudent(new Student(102, "하길동", 3, 12, "철학", "호서대"));
		addStudent(new Student(103, "허길동", 3, 13, "산업디자인", "호서대"));
		
		transfer(100, 13, "산업디자인"); //전과 : 학번이 100인 학생이 산업디자인과로 전과
		studentInfoByStudNum(102);	  //102학번 학생 조회
		studentsInfoByDeptNum(13);	 //학과번호가 13인 학생목록 조회

	}
}

//학번 : 102, 이름 : 하길동, 학과 : 철학, 대학 : 호서대
//학번 : 100, 이름 : 홍길동, 학과 : 산업디자인, 대학 : 호서대
//학번 : 103, 이름 : 김길동, 학과 : 산업디자인, 대학 : 호서대