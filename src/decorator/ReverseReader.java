package decorator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class ReverseReader extends BufferedReader {

	public ReverseReader(Reader in) {
		super(in);
		// TODO Auto-generated constructor stub
	}
	
	public String reverseLine() throws IOException{
		String lineString =  super.readLine();
		if(lineString == null) return null;
		return reverse(lineString);
	}
	
	private String reverse(String source) {
		String resultString = "";
		for(int i = 0;i<source.length();i++) {
			resultString = source.charAt(i) + resultString;
		}
		return resultString;
	}

}
