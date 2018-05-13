package com.MyPractice;

import java.util.HashMap;

public class Store {
	
	private  static HashMap<String,Item> itemValue = new HashMap();
	
	static {
		
		System.out.println("Static block is executing");
		Item pen = new Item();
		pen.item_name = "pen";
		pen.item_price = 15;
		pen.item_qty = 100;
		itemValue.put("Pen" ,pen);
		
		Item pencil = new Item();
		pencil.item_name = "Pencil";
		pencil.item_price = 4;
		pencil.item_qty = 120;
		itemValue.put("Pencil",pencil);
		
		Item ruler = new Item();
		ruler.item_name = "Ruler";
		ruler.item_price = 5;
		ruler.item_qty = 110;
		itemValue.put("Ruler",ruler);
		
		Item noteBook = new Item();
		noteBook.item_name = "Ruler";
		noteBook.item_price = 25;
		noteBook.item_qty = 10;
		itemValue.put("NoteBook",noteBook);
		
	}
	
	public static Item getItem(String item) {
		
		Item i1 = itemValue.get(item);
		Item i2 = new Item();
		i2.item_name = i1.item_name;
		i2.item_price = i1.item_price;
		i2.item_qty = 1;
		
		System.out.println(i2);
		System.out.println(i1);
		i1.item_qty = i1.item_qty-1;
		
		return i2;
		
	}
		

}
