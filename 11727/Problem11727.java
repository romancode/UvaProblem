package pcg1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Problem11727 {

	public static void main(String[] args) throws  IOException {	

		List<Long> input;
		int k=0;
		final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int NoOfTC= Integer.parseInt(reader.readLine());	

		while(k<NoOfTC){

			String line= reader.readLine();			
			String REGEX_WHITESPACE = "\\s+";
			String cleanLine = line.trim().replaceAll(REGEX_WHITESPACE, " ");
			String[] tokens = cleanLine.split(REGEX_WHITESPACE);

			if (tokens.length == 3) {
				
				input=new ArrayList<Long>();
				
				for(int j=0;j<3;j++){
					long temp=new Long(tokens[j]).longValue();
					input.add(temp);

				}				

				Collections.sort(input);

				System.out.println("Case "+ (k+1) +": "+input.get(1));				
			}

			k++;
		}
	}
}
