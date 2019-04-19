package dikshit.shoppingCart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Checkout {
	public static void main(String args[]) {
		
		Products products = new Products();
		CalculatePrice calPrice = new CalculatePrice();
		List<String> list = new ArrayList<>();
		
		products.addItems("apple", 0.6);
		products.addItems("orange", 0.25);

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter item: ");
		String s = scan.nextLine();
		String arr[] = s.split(",");
		
		list = Arrays.asList(arr);
//		list.add("apple");
//		list.add("apple");
//		list.add("orange");
//		list.add("apple");
		
		double totalCost = calPrice.calculate(list, products.getItems());

		System.out.println(totalCost + "£");
		scan.close();
	}
}
