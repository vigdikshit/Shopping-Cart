package dikshit.shoppingCart;

import java.util.List;
import java.util.Map;

public class CalculatePrice {

	public double calculate(List<String> items, Map<String, Double> products) {

		double totalCost = 0;
		for (String item : items) {
			if (item.equals("apple")) {
				totalCost += products.get(item);
			} else if (item.equals("orange")) {
				totalCost += products.get(item);
			}
		}
		return totalCost;

	}
}
