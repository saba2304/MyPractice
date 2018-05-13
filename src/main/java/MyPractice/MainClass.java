package MyPractice;

import com.MyPractice.Item;
import com.MyPractice.ShoppingCart;
import com.MyPractice.Store;

public class MainClass {

	public static void main(String[] args) {
		
		ShoppingCart c1 = new ShoppingCart();
		System.out.println(c1);
		Item i1 = Store.getItem("Pen");
		Item i2 = Store.getItem("Pencil");
		Item i3 = Store.getItem("Ruler");
		System.out.println("Items bought from the store");
		c1.addItem(i1);
		c1.addItem(i2);
		c1.addItem(i3);
		System.out.println("Items added in the shopping cart");
		
		System.out.println("Total price of the items bought:  "+c1.totalPrice());
		
		

	}

}
