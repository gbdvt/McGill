package assignment1.items;

public class Snack extends StoreItem {
	private String typeOfSnack;
	private int[] expirationDate;
	
	public Snack(double price, int HI, String typeOfSnack, int[] expirationDate) {
		super(price, HI);
		this.typeOfSnack = typeOfSnack;
		
		if (expirationDate.length != 3) {
			throw new IllegalArgumentException("Must contain exactly 3 integers: [Day, Month, Year");
		}
		
		this.expirationDate = expirationDate;
	}
	
	/*public boolean equals(Object obj) {
		if (this==obj) {
			return true;
		}
	}*/
	
	public boolean isExpired() {
		if (MyDate == this.expirationDate) {
			
		}
	}
	
	
}
