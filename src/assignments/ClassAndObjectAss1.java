package assignments;

public class ClassAndObjectAss1 {

	/*
	 * Implement GetBeets() and SetBeets(int beets) methods bodies in the
class Solution.
• The class has an integer member beets.
• GetBeets() should return the value of beets.
• SetBeets() should set the value of beets.
Hint:
	 */
	int beets;//100
	
	public int getBeets() {
		return beets;
	}
	
	public void setBeets(int beetsCount) {
		beets=beetsCount;
	}
	
	public static void main(String[] args) {
		ClassAndObjectAss1 c1 = new ClassAndObjectAss1();
		c1.setBeets(500);
		System.out.println("No of beets are: " + c1.getBeets());
		

	}

}
