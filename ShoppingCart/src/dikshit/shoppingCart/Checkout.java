package dikshit.shoppingCart;

import java.util.ArrayList;
import java.util.List;

public class Checkout {
	public static void main(String args[]) {
		
		Products products = new Products();
		CalculatePrice calPrice = new CalculatePrice();
		List<String> list = new ArrayList<>();
		
		products.addItems("apple", 0.6);
		products.addItems("orange", 0.25);

		list.add("apple");
		list.add("apple");
		list.add("orange");
		list.add("apple");
		
		double totalCost = calPrice.calculate(list, products.getItems());

		System.out.println(totalCost + "£");
	}
}
