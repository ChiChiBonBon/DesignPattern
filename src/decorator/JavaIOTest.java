package decorator;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class JavaIOTest {
	
	@SuppressWarnings("resource")
	@Test
	public void test() throws IOException{
		System.out.println("===FileReader讀取檔案===");
		FileReader reader = new FileReader("src\\decorator\\test.txt");
		int c = reader.read();
		while (c >= 0) {
			System.out.print((char)c);
			c = reader.read();
		}
		
		System.out.println("===bufferedReader讀取檔案===");
		BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\decorator\\test.txt"));
		
		String lineString = bufferedReader.readLine();
		while(lineString != null) {
			System.out.println(lineString);
			lineString = bufferedReader.readLine();
		}
		
		System.out.println("===Reverse Reader反轉讀入的內容===");
		ReverseReader reverseReader = new ReverseReader(new FileReader("src\\decorator\\test.txt"));
		
		String rLine = reverseReader.reverseLine();
		while(rLine != null) {
			System.out.println(rLine);
			rLine = reverseReader.reverseLine();
		}
	}
}
