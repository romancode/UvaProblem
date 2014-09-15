package set1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class P100 {

	public static void main(String[] args) throws IOException {

		Q100 q100 = new Q100();
		final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
					
		String line;
        while ((line = reader.readLine()) != null) {
            String REGEX_WHITESPACE = "\\s+";
            String cleanLine = line.trim().replaceAll(REGEX_WHITESPACE, " ");
            String[] tokens = cleanLine.split(REGEX_WHITESPACE);
            if (tokens.length == 2) {
                long a = new Long(tokens[0]).longValue();
                long b = new Long(tokens[1]).longValue();
                System.out.println(cleanLine + " " + q100.CalculteCycleBetweenTwo(a, b));
            }
        }
	}

	public static class Q100{


		public long CalculteCycle(long originalNumber) {
			long n = originalNumber;
			long count = 1;
			while (n > 1) {
				if (n % 2 == 1) {
					long newNumber = (3 * n) + 1;
					if (newNumber < n) {
						throw new RuntimeException("overflow :" + originalNumber);
					} else {
						n = newNumber;
					}
				} else {
					n = n / 2;
				}
				count++;
			}
			return count;
		}

		public long CalculteCycleBetweenTwo(long i,long j){
			long cycle=1,tempCycle=1,min, max;

			if(i>j){
				max=i;
				min=j;			
			}
			else{
				max=j;
				min=i;
			}		
			for(;min<=max;min++){
				tempCycle=CalculteCycle(min);
				if(tempCycle>cycle)
					cycle=tempCycle;
			}

			return cycle;
		}

	}
}
