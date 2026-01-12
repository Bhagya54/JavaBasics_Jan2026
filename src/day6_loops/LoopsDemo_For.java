package day6_loops;

public class LoopsDemo_For {
	/*
	 * Loops for for(initialization;condition;increment/decrement){
	 * 
	 * }
	 * 
	 * while while(condition){ statements } do while
	 * 
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {// i- 6<=5
			System.out.println("Hello");
		}

		System.out.println("Print value from 10 to 2");// 10 8 6 4 2
		for (int i = 10; i >= 2; i = i - 2) {
			System.out.print(i+" ");//10 8 6 4 2
		}
	}

}
