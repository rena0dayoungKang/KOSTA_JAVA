package chapter11;

import java.util.ArrayList;

public class Exam11_1 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Integer> kyo = new ArrayList<>(); // 교집합
		ArrayList<Integer> cha = new ArrayList<>(); // 차집합
		ArrayList<Integer> hap = new ArrayList<>(); // 합집합
		
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		//(1) 알맞은 코드를 넣어 완성하시오.
		kyo.addAll(list1);  //리스트1을 모두 넣어놓고 
		kyo.retainAll(list2); //리스트2랑 같은 것을 유지하는 것
		
		cha.addAll(list1);
		cha.removeAll(list2);
		
		hap.addAll(list1);
		hap.removeAll(kyo);
		hap.addAll(list2);
		
		
		
		System.out.println("list1=" + list1);
		System.out.println("list2=" + list2);
		System.out.println("kyo=" + kyo);
		System.out.println("cha=" + cha);
		System.out.println("hap=" + hap);

	}

}
