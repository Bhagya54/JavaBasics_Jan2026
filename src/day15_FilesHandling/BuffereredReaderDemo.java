package day15_FilesHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BuffereredReaderDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("./src/day15_FilesHandling/data");
		BufferedReader br = new BufferedReader(fr);
		
		String s=null;
		while((s=br.readLine())!=null) {
			System.out.println(s);
		}
		
	
	}

}
