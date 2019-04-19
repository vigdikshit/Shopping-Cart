# Shopping-Cart
Shopping Cart

I have used java language to create Shopping cart application.
My program contains 4 classes namely: CalculatePrice.java, Checkout.java, Offer.java, Products.java

1. Products.java: This class contains a map which takes String as key and double as value. The string represents the items i.e.
apple and orange in this case and value represents the cost of that particular item. This class also contains methods like addItems to
add items to the map, removeItems to remove them from app and get method to return map.

2. Offer.java: This class contains offer information for the items. It has fields like items, buyCount,freeCount and getter and setters
methods. For Example, in case of offer: "buy one, get one free on Apples" , item will be apple,buyCount will be 1 and freeCount will be 1.

3. Checkout.java: The program starts runnig from here. It creates Products and offer objects and set items with their cost in products
object and offers in offer object class. Then it takes input from the user. Input is the items which the user wants to buy. When the 
program runs, user will give input like apple,apple,orange,apple and then press enter. The items will be put in the list and it will 
be pass to the calculate method which is defined in another class called CalculatePrice.java

4. CalculatePrice.java: It has the calculate method which calculates the total cost to the user and return.
