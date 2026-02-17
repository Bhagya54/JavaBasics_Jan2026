package day15_FilesHandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	
	/*
	 * Book  > library
	 * IOException - parents
	 * FileNotFoundException - child
	 */

	public static void main(String[] args) throws IOException  {
		FileReader fr = new FileReader("./src/day15_FilesHandling/data");
		//System.out.println((char)fr.read());
		System.out.println("File is being read");
		int a=0;
		while((a=fr.read())!=-1) {
			System.out.print((char)a);
		}
		
		
	}

}
