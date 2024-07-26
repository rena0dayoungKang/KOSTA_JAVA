package com.test04;

public class Airplane extends Plane{
	
	public Airplane() {
		// TODO Auto-generated constructor stub
	}
	
	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	@Override
	void flight(int distance) {
		fuelSize -= 3*distance;
	}


}
