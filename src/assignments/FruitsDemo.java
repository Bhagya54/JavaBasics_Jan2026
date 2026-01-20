package assignments;

import java.util.Random;

public class FruitsDemo {
	String Fruit;//orange
	
	public FruitsDemo(String[] fruits) {
		Random ran = new Random();
		int randomValue=ran.nextInt(fruits.length);
		System.out.println(randomValue);
		//Fruit=fruits[2];//orange
		Fruit=fruits[randomValue];
	}
	
	public String GetFruit() {
		return Fruit;
	}
	
	public static void main(String[] args) {
		String[] fruits = {"apple","banana","orange","guava"};
		FruitsDemo fd = new FruitsDemo(fruits);
		System.out.println(fd.GetFruit());
	}

}
