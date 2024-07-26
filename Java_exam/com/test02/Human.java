package com.test02;

public class Human {
	
	protected String name; 
	protected int age;
	protected int height;
	protected int weight;
	
	
	public Human() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param age
	 * @param height
	 * @param weight
	 */
	public Human(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return String.format("%s %d %d %d", name, age, height, weight);
	}
	

}
