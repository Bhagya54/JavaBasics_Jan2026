package day11_NestedForLoop;

public class MatrixDemo {
	
	
	public static void main(String[] args) {
		int[][] num = 
			{ 
					{3,5,7,8},
					{1,4,8,7},
					{2,7,9,8}
			};
		
		for(int row=0;row<num.length;row++) {
			for(int col=0;col<num[row].length;col++) {
				System.out.print(num[row][col]+" ");
			}
			System.out.println();
		}
	
	
	}
				


}
