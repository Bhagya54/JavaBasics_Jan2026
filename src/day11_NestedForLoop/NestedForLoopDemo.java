package day11_NestedForLoop;

public class NestedForLoopDemo {

	public static void main(String[] args) {
		int[] num= {1,4,5};
		/* i=0<3,j=0<3 >> 1,1
		 * i=0<3,j=1<3 >> 1,4
		 * i=0<3,j=2<3 >> 1,5
		 * i=1<3,j<0<3 >> 4,1
		 * i=1<3,j=1<3 >> 4,4
		 * i=1<3,j=2<3 >> 4,5
		 */
		
		for(int i=0;i<num.length;i++) { 
			for(int j=0;j<num.length;j++){
			System.out.print("("+num[i] + ","+num[j]+ ") ");
		}
			System.out.println();
		}

	}

}
