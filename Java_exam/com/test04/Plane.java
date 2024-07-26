package com.test04;

public abstract class Plane {
	
	String planeName;
	int fuelSize;
	
	
	
	/**
	 * @return the planeName
	 */
	public String getPlaneName() {
		return planeName;
	}
	/**
	 * @param planeName the planeName to set
	 */
	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}
	/**
	 * @return the fuelSize
	 */
	public int getFuelSize() {
		return fuelSize;
	}
	/**
	 * @param fuelSize the fuelSize to set
	 */
	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
	
	
	
	Plane() {}
	Plane(String planeName, int fuelSize) {}
	
	public int refuel(int fuel) {
		return this.fuelSize + fuel;
	}
	
	abstract void flight(int distance); //운항
	
	

}
