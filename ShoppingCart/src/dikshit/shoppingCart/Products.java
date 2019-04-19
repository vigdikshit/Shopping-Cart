package dikshit.shoppingCart;

import java.util.HashMap;
import java.util.Map;

public class Products {

	private Map<String, Double> items;

	public Products() {
		items = new HashMap<>();
	}

	public Products(Map<String, Double> items) {
		this.items = items;
	}

	public void addItems(String item, double d) {
		items.put(item, d);
	}

	public void removeItems(String item) {
		items.remove(item);
	}

	public Map<String, Double> getItems() {
		return items;
	}
}
