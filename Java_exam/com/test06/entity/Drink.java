package com.test06.entity;

public class Drink {

	int price; // 가격

	public Drink() {
	}

	public Drink(int price) { // 쥬스가격이 인자로 넘어옴. 그래서 price가 쥬스가격으로 설정되고, Biz로 가서 Dirnk[] 배열의 i번째에 juice클래스가
								// 객체생성되어서 저장됨.
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
