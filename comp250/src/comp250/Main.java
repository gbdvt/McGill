package comp250;
class Main {
	public static void main(String[] args) {
		
	}
	
	public static boolean isPrime(int n) {
		int k=0;
		if (n<=1) {
			throw new IllegalArgumentException("n should be greater than 1");
		} else {
			for (int i=1; i<n; i++) {
				if (n%i!=0) {
					k=1;
				}
			}
		}
		if (k==0) {
			System.out.println("Is prime.");
		} else {
			System.out.println("Is not prime.");
		}
		return false;
	}
}