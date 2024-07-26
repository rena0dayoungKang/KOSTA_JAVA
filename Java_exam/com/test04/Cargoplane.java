package com.test04;

public class Cargoplane extends Plane{
	
	public Cargoplane() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param planeName
	 * @param fuelSize
	 */
	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
		
	}

	@Override
	void flight(int distance) {
		fuelSize -= 5*distance;
		
	}
	




	
	
}
