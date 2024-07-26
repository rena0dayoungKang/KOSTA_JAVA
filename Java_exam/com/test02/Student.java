package com.test02;

public class Student extends Human{
	
	String number;
	String major;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param age
	 * @param height
	 * @param weight
	 * @param number
	 * @param major
	 */
	public Student(String name, int age, int height, int weight, String number, String major) {
		super(name, age, height, weight);
		this.number = number;
		this.major = major;
	}

	@Override
	public String toString() {
		return String.format("%s %d %d %d %s %s", name, age, height, weight, number, major);
	}
	
}
