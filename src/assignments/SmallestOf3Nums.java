package assignments;

public class SmallestOf3Nums {

	public static void main(String[] args) {
		int a=30;
		int b=20;
		int c=12;
		
		if(a<b && a<c) {
			System.out.println("a is the smallest");
		}
		else if(b<c) {
			System.out.println("b is the smallest");
		}
		else {
			System.out.println("c is the smallest");
		}

	}

}
