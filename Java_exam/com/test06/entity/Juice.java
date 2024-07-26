package com.test06.entity;

public class Juice extends Drink {
	
	public static final int JUICE_PRICE = 200;
	
	public Juice() {
		super(JUICE_PRICE); //Drink의 인자가 있는 생성자를 호출
	}



	@Override
	public String toString() {
		return String.format("쥬스");
	}
}
