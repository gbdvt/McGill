package assignment1.items;

public abstract class Drink extends StoreItem {
	public static int MAX_PACK_SIZE;
	public static int BUZZY_HAPPINESS_BOOST;
	
	protected int numberOfBottles;
	private boolean isBuzzy;
	
	public Drink(double price, int HI, int numberOfBottles, boolean isBuzzy) {
		super(price, HI); // call to the storeitem constructor
		this.numberOfBottles = numberOfBottles;
		this.isBuzzy=isBuzzy;
	}
	
	public int getNumOfBottles() {
		return this.numberOfBottles;
	}
	/*public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (obj == null || getClass() !=obj.getClass()) {
			returns false;
		}
		
		if (!super.equals(obj)) {
			return false;
		}
		
		Drink other (Drink) obj;
		return this.isBuzzy == other.isBuzzy;
	}*/
	
	public int getHappinessIndex() {
		int HI = super.getHappinessIndex();
		if (isBuzzy) {
			HI+=BUZZY_HAPPINESS_BOOST;
		}
		
		return HI;
	}
	
/*	public combine(Drink other) {
		
		if (this!=other) {
			return false;
		}
		
		int totalBottles = this.numberOfBottles + other.numberOfBottles;
		if (totalBottles > MAX_PACK_SIZE) {
			this.numberOfBottles=MAX_PACK_SIZE;
			other.numberOfBottles=totalBottles-MAX_PACK_SIZE;
		} else {
			
		}
		
		return 0;
	} */
	
	/*public abstract getPortion(int portion) {
		return Drink;
	} */


}
