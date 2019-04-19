package dikshit.shoppingCart;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Checkout class (Program will start from here)
 *
 */
public class Checkout {

	/**
	 * Main method
	 */
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		try {
			Offer apple = new Offer("apple", 1, 1);
			Offer orange = new Offer("orange", 2, 1);

			Products products = new Products();
			CalculatePrice calPrice = new CalculatePrice();

			List<String> list = new ArrayList<>();

			Map<String, Offer> offr = new HashMap<>();
			offr.put(apple.getItem(), apple);
			offr.put(orange.getItem(), orange);

			products.addItems("apple", 0.6);
			products.addItems("orange", 0.25);

			// Read input from user and put it in array
			while (true) {
				System.out.println("Enter items with comma seperated (like apple,orange,apple) : ");
				String s = scan.nextLine().toLowerCase();
				String arr[] = s.split(",");
				list = Arrays.asList(arr);

				double totalCost = calPrice.calculate(list, products.getItems(), offr);
				System.out.println(new DecimalFormat("0.00").format(totalCost) + "£");

			}

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (scan != null) {
				scan.close();
			}
		}
	}
}
