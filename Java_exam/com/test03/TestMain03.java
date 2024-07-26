package com.test03;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TestMain03 {

	public static void main(String[] args) {
		
		 String str = "1.22,4.12,5.93,8.71,9.34";
		 StringTokenizer st = new StringTokenizer(str,",");		//배열이 된다
		
		 
		 List<Double> list = new ArrayList<Double>();
		 while(st.hasMoreTokens()) {
			 Double toAdd = Double.parseDouble(st.nextToken());
			 list.add(toAdd);
		 }
		 
//		 System.out.println(st.countTokens());
//		 for (int i = 0; i <= st.countTokens();i++) {
//			 Double toAdd = Double.parseDouble(st.nextToken());
//			 list.add(toAdd);
//		 }
		 
		 
		 System.out.println(list);
		 
		 
		 double total = 0.0;
		 double average = 0.0;
		 for (int i = 0; i < list.size(); i++) {
			 total += list.get(i);
			 average = total / list.size();
		 }
		 
		 
		 System.out.printf("합 계 : %.3f\n" ,total);
		 System.out.printf("평 균 : %.3f" , average);		 
		 
	}

}

//합 계: 29.320
//평 균: 5.864
