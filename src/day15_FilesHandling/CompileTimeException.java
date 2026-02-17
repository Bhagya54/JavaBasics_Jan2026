package day15_FilesHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CompileTimeException {
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
	    
		//FileReader fr = new FileReader("./src/day15_FilesHandling/data1");
	    
		
		System.out.println("File is being read");
		System.out.println("File is being read");
	}

}
