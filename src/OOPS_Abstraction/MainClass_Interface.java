package OOPS_Abstraction;

public class MainClass_Interface {

	public static void main(String[] args) {
		RBI icici = new ICICIBank();
		icici.deposit();
		icici.withdraw();
		//icici.creditCard();
		//we cannot create object for an interface
		//RBI rbi = new RBI();
		
		RBI hdfc = new HDFCBank();
		hdfc.deposit();
		hdfc.withdraw();
		
		
		
		//Selenium 
		/*
		 * WebDriver -  Interface
		 * ChromeDriver - class
		 * FirefoxDriver - class
		 * EdgeDriver - class
		 * 
		 * WebDriver driver = new ChromeDriver();
		 * driver = new FirefoxDriver();
		 */
		
		AbstractDemo a1 = new AbstractDemoChildClass();
		a1.m1();
		a1.m2();

	}

}
