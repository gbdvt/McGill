package comp250;

public class Test {
		
    public static int[] firstNPrimes(int n) {
    	int[] primes = new int[];
    	
    }
	
    
    public static boolean isPrime(int n) {
    	if (n<2) {
    		return false;
    	} else {
    		for (int i=2; i<=Math.sqrt(n); i++) {
    			if (n%i == 0) return false;
    		} return true;
    	}
    }
	public static void main(String args[]) {
		System.out.println(countUpper("HellO"));
		
	}
}
