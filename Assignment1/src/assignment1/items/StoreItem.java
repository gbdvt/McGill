package assignment1.items;

public abstract class StoreItem {
	
	private double price;
	private int HI;
	
	public StoreItem(double price, int HI) {
		this.price = price;
		this.HI = HI;
		
		if (price < 0 || HI < 0 ) {
			throw new IllegalArgumentException("Price and Happiness Index cannot be negative.");
		}
	}
	
	public final double getPrice() {
		return this.price;
	}
	
	public int getHappinessIndex() {
		return this.HI;
	}
	
	/*public boolean equals(Object obj) {
		if (this==obj) {
			return True
		} else {
			
		}*/
		
	}
	
}



