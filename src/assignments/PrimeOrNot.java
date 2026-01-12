package assignments;

public class PrimeOrNot {
	
	public static boolean isPrime(int n) {
		//11 - 1 and 5 - (2 - 4)
		for(int i=2;i<=n-1;i++) {//5<=4
			if(n%i==0) { //5%4==0
				return false;//no more a prime num
			}
		}
		
		return true;//its a prime
		
	}

	public static void main(String[] args) {
		int n=15;
		if(isPrime(n)==true) {
			System.out.println("n is prime");
		}
		else {
			System.out.println("n is not prime");
		}

	}

}
