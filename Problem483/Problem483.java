package p483;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Problem483 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

		String line=reader.readLine();
		String REGEX_WHITESPACE = "\\s+";
		String cleanLine = line.trim().replaceAll(REGEX_WHITESPACE, " ");
		String[] token=cleanLine.split(REGEX_WHITESPACE);
		
		for(int i=0;i<token.length;i++){
			String temp= new StringBuilder(token[i]).reverse().toString();
			System.out.print(temp+" ");
		}
	}

}
