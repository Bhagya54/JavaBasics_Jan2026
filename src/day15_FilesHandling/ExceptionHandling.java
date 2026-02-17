package day15_FilesHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandling {
/*Exception
 * 1.throws declaration
 * 2.try/catch
 * try{
 *		risky code
 * }
 * 
 * catch(Exception e){
 * syso(file not present)
 * }
 * 
 * Types of Exception:
 * 1. Compile - 
 * 		FileNotFound
 * 		IOException
 * 2. Runtime
 * .java > compiled(byte code) - .class > run
 * 
 */
	public static void main(String[] args) {
	    try {
		FileReader fr = new FileReader("./src/day15_FilesHandling/data1");
	    }
	    catch(FileNotFoundException e) {
	    	System.out.println("File is not present. Please check the path");
	    }
		
		System.out.println("File is being read");
		System.out.println("File is being read");
	}

}
