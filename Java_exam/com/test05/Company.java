package com.test05;

import java.util.HashMap;
import java.util.Set;


public class Company {

	public static void main(String[] args) {
		HashMap<Integer, Employee> map = new HashMap<>();

		// 1번의 데이터를 기반으로 객체를 생성하여 HashMap에 저장한다.		
		map.put(1, new Secretary("홍길동", 1, "Secretary", 800));
		map.put(2, new Sales("이순신", 2, "Sales", 1200));
		
		//Employee employee = map.get(2);
		//System.out.println(employee); 
		//-> value값이 왜 안나오지? : toString을 안만들었다
		// HashMap에 저장시 키 값은 각 객체의 Number로 한다.
		
		// 모든 객체의 기본 정보를 출력한다. ( for문 이용 , keySet() 이용 )
		System.out.println("name\t\tdepartment\tsalary");
		System.out.println("---------------------------------------");
		Set<Integer> kSet = map.keySet();
		
		//?keySet으로 map출력하는 방법!
		for (Integer key : map.keySet()) {
			System.out.println(map.get(key).toString());
		}
		
		// 모든 객체의 인센티브 100씩 지급한다.
		// employee는 인터페이스에 대해 상속받지 않았기 때문에 instanceof를 사용해주어야한다.
		for (Employee employee : map.values()) {			
			if(employee instanceof Sales) {
				((Sales) employee).incentive(100);
			} else {
				((Secretary) employee).incentive(100); 
			}
		}

		
		
		// 모든 객체의 정보와 세금을 출력한다. ( for문 이용 )
		System.out.println("\n인센티브 100지급\n");
		System.out.println("name\t\tdepartment\tsalary\ttax");
		System.out.println("-------------------------------------------");
		
		for (Integer key : map.keySet()) {
			System.out.print(map.get(key).toString()+"\t");
			System.out.println(String.format("%.2f", map.get(key).tax()));
		}
	}

}

