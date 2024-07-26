package com.test02;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {

	public static void main(String[] args) {
		
		Student student1 = new Student("홍길동", 20, 177, 74, "201301", "체육");
		Student student2 = new Student("이순신", 44, 178, 77, "201302", "체육");
		Student student3 = new Student("유관순", 18, 155, 45, "201303", "컴퓨터");
		
		List<Student> list = new ArrayList<Student>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		
		for(Student std : list) {
			System.out.println(std.toString());
		} 

	}

}

//홍길동 20  177  74  201301  체육
//이순신 44  178  77  201302  체육
//유관순 18  155  45  201303  컴퓨터
