package dikshit.shoppingCart;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalculatePrice {

	/**
	 * This method calculates the total price for the items present in the shopping
	 * cart
	 * 
	 * @param items
	 * @param products
	 * @param offer
	 * @param offrCounter
	 * @return
	 */
	public double calculate(List<String> items, Map<String, Double> products, Map<String, Offer> offer) {
		Map<String, Integer> offrCounter = new HashMap<>();
		for(String item: offer.keySet()) {
			offrCounter.put(item, 0);
		}
		
		double totalCost = 0;
		for (String item : items) {
			if (products.containsKey(item)) {
				if (offer.containsKey(item)) {
					Offer offr = (Offer) offer.get(item);
					if (offrCounter.get(item) < offr.getBuyCount()) {
						offrCounter.put(item, offrCounter.get(item) + 1);
						totalCost += products.get(item);
					} else if (offrCounter.get(item) < (offr.getBuyCount() + offr.getFreeCount() - 1)) {
						offrCounter.put(item, offrCounter.get(item) + 1);
					} else {
						offrCounter.put(item, 0);
					}
				} else {
					totalCost += products.get(item);
				}
			}
		}
		return totalCost;

	}
}
