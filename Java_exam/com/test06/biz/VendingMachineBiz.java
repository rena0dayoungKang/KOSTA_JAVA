package com.test06.biz;

import java.util.ArrayList;

import com.test06.entity.Drink;

public class VendingMachineBiz implements IVendingMachineBiz {
	
	int balance = 1000; //현재잔액
	Drink[] cartList = new Drink[3]; //구입목록 배열 
	int count; //배열 갯수
	
	
	

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public void cartDrink(Drink drink) {
		//1) 현재 잔액을 출력한다. ( Sample Run 참조 )
		System.out.printf(String.format("현재 잔액 : %,d", balance));
		//2) 매개변수로 넘겨받은 Drink 타입에 대한 메시지를 출력한다. (실행결과 참조)
        //메시지 출력시 Drink 타입의 toString() 메소드를 사용한다.
		cartList[count++] = drink; //new Juice()가 drink에 들어갔으니까 drink만 써주면 된다. 
		
		
	}

	@Override
	public void printCart() {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<Drink> printDrinkList(ArrayList<Drink> list) {
		// TODO Auto-generated method stub
		return null;
	}

}
