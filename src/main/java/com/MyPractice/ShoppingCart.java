package com.MyPractice;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item) {
		
		items.add(item);
	}
	
	public float totalPrice() {
		
		int i = 0;
		float total = 0;
		
		for(i=0;i<items.size();i++) {
			
			Item i1 = items.get(i);
			total = total + i1.item_price;
		}
		
		return total;
	}
}
