package com.test06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.test06.biz.VendingMachineBiz;
import com.test06.entity.Coffee;
import com.test06.entity.Coke;
import com.test06.entity.Drink;
import com.test06.entity.Juice;

public class VendingMachineTest {
	Scanner scanner = new Scanner(System.in);
	Map<Integer, Drink> drinks = new HashMap<>();

	int printMenu() {
		System.out.println("=================================");
		System.out.println("[음료수 자판기 관리 시스템]");
		System.out.println("=================================");
		System.out.println("1. 전체 음로수 및 잔액 보기");
		System.out.println(String.format("2. 쥬스 구입하기 ( %3d원 )", Juice.JUICE_PRICE));
		System.out.println(String.format("3. 커피 구입하기 ( %3d원 )", Coffee.COFFEE_PRICE));
		System.out.println(String.format("4. 코크 구입하기 ( %3d원 )", Coke.COKE_PRICE));
		System.out.println("5. 구입한 음료수 목록 보기");
		System.out.println("9. 종료");
		System.out.println("=================================");
		System.out.print("메뉴 입력 = > ");
		int sel = Integer.parseInt(scanner.nextLine());
		if (sel <= 0 || (sel >= 6 && sel <= 8) || sel > 9) {
			System.out.println("메뉴값을 확인 후 다시 입력하세요");
		}
		return sel;
	}

	public static void main(String[] args) {
		VendingMachineTest vmt = new VendingMachineTest();
		VendingMachineBiz vmb = new VendingMachineBiz();
		
		int sel;
		while (true) {
			sel = vmt.printMenu();
			if (sel == 9) { //9.종료
				break;
			}

			switch (sel) {
			case 1:
				System.out.println("==================");
				System.out.println("음료수명\t가격");
				System.out.println("==================");
				System.out.println(String.format("커피\t%d원", Coffee.COFFEE_PRICE));
				System.out.println(String.format("코크\t%d원", Coke.COKE_PRICE));
				System.out.println(String.format("쥬스\t%d원", Juice.JUICE_PRICE));
				System.out.println("---------------");
				System.out.println(String.format("현재 잔액 : %d원", vmb.getBalance()));
				break;
			case 2:
				vmb.cartDrink(new Juice());
				//쥬스 구입을 하려면 vmb에 있는 cartDrink 메서드에 new Juice() 인자값으로 넘어간다 
				//cartDrink (Drink)타입으로 
				break;
			case 3:
				vmb.cartDrink(new Coffee());
				break;
			case 4:
				vmb.cartDrink(new Coke());
				break;
			case 5:
				vmb.printCart();
				break;
			}
		}

	}

}
