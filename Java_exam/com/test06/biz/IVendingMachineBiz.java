package com.test06.biz;

import java.util.ArrayList;

import com.test06.entity.Drink;

abstract public interface IVendingMachineBiz {
	
	abstract void cartDrink(Drink drink);
	
	abstract void printCart();
	
	abstract ArrayList<Drink> printDrinkList(ArrayList<Drink> list);  
	
}
