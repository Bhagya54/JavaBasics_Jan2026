package day10_Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int s1_rollNo=12;
		int s2_rollNo=13;
		int s3_rollNo=14;
		//Array - stores multiple values of same datatype
		/*3 parts:
		 * 1.Declaration
		 * 2.Instantiation
		 * 3.Initialization
		 * 
		 * Rules:
		 * 1. While instantiation we should provide the size of an array
		 * 2. Array index starts from 0
		 * 3. If we don't initialize any index value, it assigns the default 
		 * value based on the datatype - int - 0,String-null
		 * 4.Duplicate values are allowed to store in an array
		 */
		int[] rollNo;//1.Declaration
		rollNo=new int[5];//Instantiation - 0,1,2,3,4
		rollNo[0]=12;
		rollNo[1]=13;
		rollNo[2]=14;//initialization
		rollNo[4]=16;
		for(int i=0;i<rollNo.length;i++) {
			System.out.println(rollNo[i]);
		}
		/* CTRL+SHIFT+/
		 * System.out.println(rollNo[0]); System.out.println(rollNo[1]);
		 * System.out.println(rollNo[2]); System.out.println(rollNo[3]);
		 * System.out.println(rollNo[4]);
		 */
		
	}

}
