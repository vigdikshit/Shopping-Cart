package dikshit.shoppingCart;

public class Offer {
	private String item;
	private int buyCount;
	private int freeCount;
	
	public Offer(String item, int buyCount, int freeCount) {
		this.item = item;
		this.buyCount = buyCount;
		this.freeCount = freeCount;
	}
	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getBuyCount() {
		return buyCount;
	}

	public void setBuyCount(int buyCount) {
		this.buyCount = buyCount;
	}

	public int getFreeCount() {
		return freeCount;
	}

	public void setFreeCount(int freeCount) {
		this.freeCount = freeCount;
	}
}
